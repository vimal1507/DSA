package main;

import input.InputReader;
import java.io.PrintWriter;

public class TheNumberofProducts {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long n = in.readLong();
        long[] arr = in.readLongArray((int)n);
        long segP = 0;
        long segN = 0;
        long countP = 1;
        long countN = 0;
        int currSign = 1;
        for (int i = 0; i < n; i++) {
            if(arr[i] < 0){
                currSign *= -1;
            }

            if(currSign > 0){
                segP += countP;
                segN += countN;
                countP++;
            }else{
                segP += countN;
                segN += countP;
                countN++;
            }
        }
            out.println(segN+" "+segP);
    }
}
