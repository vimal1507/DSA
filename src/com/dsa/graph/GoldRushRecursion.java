package com.dsa.graph;

public class GoldRushRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() {
        int m = 6;//in.readInt();
        int x = 4;//in.readInt();

        boolean res = gr(m,x);
        if ((res)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean gr(int m, int x){
        if(m == x) {
            return true;
        }

        if(x>m || m%3 != 0)
            return false;

            return gr(m/3,x) || gr(2*m/3,x);
    }

}
