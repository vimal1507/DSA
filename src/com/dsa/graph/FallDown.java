package com.dsa.graph;

public class FallDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void solve() {
        int n = 5;//in.readInt();
        int m = 6;//in.readInt();
        char[][] grid = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
//                grid[i][j] = in.readCharacter();
            }
        }
        for(int c = 0; c < m; c++ ) {
            int emptyRow = n-1;
            for(int r = n-1; r >= 0; r--) {

                if(grid[r][c] == 'o') {
                    emptyRow = r-1;
                }else if(grid[r][c] == '*') {
                    char temp = grid[r][c];
                    grid[r][c] = grid[emptyRow][c];
                    grid[emptyRow][c] = temp;
                    emptyRow--;

                }
            }
        }
        for(char[] x : grid){
            for (char z : x){
                System.out.print(z);
            }
            System.out.println();
        }
        System.out.println();
    }

}
