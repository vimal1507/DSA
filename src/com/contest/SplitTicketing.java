package com.contest;

public class SplitTicketing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    public void solve(int testNumber, InputReader in, PrintWriter out) {
	        int n = in.readInt();
	        int[][] a = new int[n+1][n+1];
	        for(int i=1; i<n; i++){
	            for(int j=i+1; j<=n; j++){
	                a[i][j] = in.readInt();
	            }
	        }
	        for(int i=1; i<=n; i++){
	            for(int j=i+1; j<=n; j++){
	                for(int k=j+1; k<=n; k++){
	                    if(a[i][k] > a[i][j] + a[j][k]){
	                        out.println("Yes");
	                        return;
	                    }
	                }
	            }
	        }
	        out.println("No");
	    }
}
