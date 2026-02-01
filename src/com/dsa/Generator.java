package main;

import input.InputReader;
import java.io.PrintWriter;

public class Generator {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.readInt();
        int m = in.readInt();

        for (int i = n; i <= m; i++) {
            int k = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    k = 0;
                    break;
                }
            }
            if (k == 1 && i != 1)
                out.println(i);
        }
        out.println();
    }
}
