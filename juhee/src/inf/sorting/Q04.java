package inf.sorting;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 삽입 정렬: O(n^2)
 */
public class Q04 {
    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(stdIn.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(stdIn.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        for (int i = 0; i < n; i++) {
            String str = String.valueOf(arr[i]);
            if (i != n - 1) str += " ";
            stdOut.write(str);
        }
        stdOut.flush();
        stdOut.close();
        stdIn.close();
    }
}
