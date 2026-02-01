package main;



import input.InputReader;
import java.io.PrintWriter;

public class CircularTrack {
    public void solve(int testNumber, InputReader in, PrintWriter out) {

            int a = in.readInt();
            int b = in.readInt();
            int m = in.readInt();
            int diff = Math.abs(a-b);
            int res = Math.min(diff, Math.abs(diff-m));
            out.println(res);
    }
}
