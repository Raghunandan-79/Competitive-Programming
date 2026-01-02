package cses.introductoryProblems;

import java.util.*;
import java.io.*;

public class WeirdAlgorithm {
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
        long n = sc.nextLong();

        while (n != 1) {
            out.print(n + " ");

            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
        }
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
