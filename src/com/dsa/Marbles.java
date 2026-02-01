package main;

import input.InputReader;
import java.io.PrintWriter;

public class Marbles {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.readLong();
        long k = in.readLong();
        long res = 1;
        for(long i=1;i<k;i++){
            res=res*((n-k)+i)/i;
        }
        out.println(res);
    }
}
