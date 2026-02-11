package com.dsa;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.util.Map;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.InputStream;

public class TrafficLight {

	public static void main(String[] args) {

	}

}



/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
 class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TrafficLight solver = new TrafficLight();
        solver.solve(1, in, out);
        out.close();
    }

    static class TrafficLight {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int x = in.readInt();
            int n = in.readInt();
            int[] arr = in.readIntArray(n);
            TreeSet<Integer> ts = new TreeSet<>();
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            StringBuilder sb = new StringBuilder();
            ts.add(0);
            ts.add(x);
            tm.put(x, 1);

            for (int i = 0; i < arr.length; i++) {

                int curr = arr[i];
                int left = ts.floor(curr);
                int right = ts.ceiling(curr);

                int oldMax = right - left;
                tm.put(oldMax, tm.get(oldMax) - 1);

                if (tm.get(oldMax) == 0) {
                    tm.remove(oldMax);
                }

                int l = curr - left;
                int r = right - curr;

                tm.put(l, tm.getOrDefault(l, 0) + 1);
                tm.put(r, tm.getOrDefault(r, 0) + 1);

                ts.add(curr);

                sb.append(tm.lastKey()).append(" ");

            }

            out.print(sb.toString());
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public int[] readIntArray(int size) {
            int[] ans = new int[size];
            for (int i = 0; i < size; i++) ans[i] = readInt();
            return ans;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}


