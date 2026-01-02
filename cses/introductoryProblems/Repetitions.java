package cses.introductoryProblems;

import java.util.*;
import java.io.*;

public class Repetitions {
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
        String S = sc.next();

        int maxCnt = 1, cnt = 1;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                cnt += 1;
            } else {
                cnt = 1;
            }
            
            maxCnt = Math.max(maxCnt, cnt);
        }

        out.println(maxCnt);
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

