package com.dsa;

public class NumberofIslands {

	public static void main(String[] args) {
		char[][] arr = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		System.out.println(numIslands(arr));
	}
	
	public static int numIslands(char[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int count = 0;
		if(m == 0 || n == 0 || grid == null)
        return 0;
		
		for(int r=0; r<m; r++) {
			for(int c=0; c<n; c++) {
				if(grid[r][c] == '1') {
					count++;
					dfs(grid, r, c);
				}
			}
		}
		return count;
    }

	private static void dfs(char[][] grid, int r, int c) {
		if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0')
			return;
		
		grid[r][c] = '0';
		
		dfs(grid, r+1, c);
		dfs(grid, r-1, c);
		dfs(grid, r, c+1);
		dfs(grid, r, c-1);
		
	}

}
