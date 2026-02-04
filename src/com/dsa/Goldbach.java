package com.dsa;
import java.io.InputStream;
import java.io.PrintWriter;

public class Goldbach {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);

        // Prepare sieve once up to 1,000,000
        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int k = i * i; k <= MAX; k += i) {
                    isPrime[k] = false;
                }
            }
        }
        java.util.List<Integer> primes = new java.util.ArrayList<>();
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) primes.add(i);
        }

        // Now read test cases
        PrintWriter pr = new PrintWriter(System.out);
        
        while (true) {
            int n = in.readInt();
            if (n == 0) break;

            // Collect primes up to n
           
            
            // two pointers
            int i = 0;
            int j = primes.size() - 1;
            for(j=0;j<primes.size() &&  primes.get(j)<=n;j++);
            j--;
            while (i <= j) {
                int s = primes.get(i) + primes.get(j);
                if (s == n) {
                    pr.println(n + " = " + primes.get(i) + " + " + primes.get(j));
                    break;
                } else if (s > n) {
                    j--;
                } else {
                    i++;
                }
            }
        }
    }

    // (same InputReader class here, unchanged)
    static class InputReader {
        private java.io.InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar, numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) return -1;
            if (curChar >= numChars) {
                try {
                    numChars = stream.read(buf);
                } catch (Exception e) {
                    return -1;
                }
                if (numChars <= 0) return -1;
                curChar = 0;
            }
            return buf[curChar++] & 0xFF;
        }

        public int readInt() {
            int c = read();
            while (c <= ' ') c = read();
            int res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return res;
        }
    }
}
