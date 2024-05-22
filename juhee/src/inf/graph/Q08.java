package inf.graph;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 8. 중복순열 구하기
 */
public class Q08 {
    static int N, M, cnt;
    static int[] arr;
    static void DFS(int L, int[] arr) {
        if (L == M + 1) {
            for (int i = 1; i <= M; i++) System.out.print(arr[i] + " ");
            System.out.println();
            cnt++;
        } else {
            for (int i = 1; i <= N; i++) {
                arr[L] = i;
                DFS(L + 1, arr);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter stdOut = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(stdIn.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M + 1];
        DFS(1, arr);
        System.out.print(cnt);
    }
}
