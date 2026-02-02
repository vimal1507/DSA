package main;

import input.InputReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class PrimeGenerator {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        long m = in.readLong();
        long n = in.readLong();
        long[] arr = new long[(int) (n-m+1)];

        for(int i=2;i*i<=n;i++){
            long start = (m/i)*i;
            if (start < m) {
                start += i;
            }
            if (start == i) {
                start += i;
            }
            for(long j=start;j<=n;j=j+i){
                arr[(int) (j-m)] = 1;
            }
        }
    for(int i=0;i<n-m+1;i++){
        if(arr[i]==0 && i+m>1){
            out.println(i+m);
        }
    }
    out.println();
    }
}
