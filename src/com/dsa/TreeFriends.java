package com.dsa;

import input.InputReader;
import java.io.PrintWriter;

public class TreeFriends {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int x = in.readInt();
        int y = in.readInt();
        int z = in.readInt();

        if (x+y==z || y+z==x || z+x==y) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
