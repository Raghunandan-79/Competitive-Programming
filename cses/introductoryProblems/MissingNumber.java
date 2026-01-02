package cses.introductoryProblems;

import java.util.*;
import java.io.*;

public class MissingNumber {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        float nextFloat() { return Float.parseFloat(next()); }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void solve() {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int xorr1 = 0, xorr2 = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr1 ^= arr[i];
            xorr2 ^= (i + 1);
        }

        out.println(xorr1 ^ xorr2);
    }

    public static void main(String[] args) {
        int T = 1;
        // T = sc.nextInt();
        while (T-- > 0) {
            solve();
        }
        out.flush();
    }
}

