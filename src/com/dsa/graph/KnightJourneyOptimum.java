package com.dsa.graph;

public class KnightJourneyOptimum {

	    static boolean found;

	    static int[] dr = {-1, 1, -2, 2, -2, 2, -1, 1};
	    static int[] dc = {-2, -2, -1, -1, 1, 1, 2, 2};

	    public static void main(String[] args) {
	        solve();
	    }

	    public static void solve() {

	        int t = 1;

	        for (int tc = 1; tc <= t; tc++) {

	            int n = 4;
	            int m = 3;

	            boolean[][] grid = new boolean[n][m];
	            StringBuilder path = new StringBuilder();

	            found = false;

	            dfs(grid, 0, 0, 1, path);

	            System.out.println("Scenario #" + tc + ":");

	            if (found)
	                System.out.println(path.toString());
	            else
	                System.out.println("impossible");

	            System.out.println();
	        }
	    }

	    private static void dfs(boolean[][] grid,
	                            int r,
	                            int c,
	                            int count,
	                            StringBuilder path) {

	        if (found) return;

	        if (r < 0 || c < 0 ||
	                r >= grid.length ||
	                c >= grid[0].length ||
	                grid[r][c])
	            return;

	        grid[r][c] = true;

	        path.append((char) ('A' + c));
	        path.append(r + 1);

	        if (count == grid.length * grid[0].length) {
	            found = true;
	            return;
	        }

	        for (int i = 0; i < 8; i++) {
	            int nr = r + dr[i];
	            int nc = c + dc[i];

	            dfs(grid, nr, nc, count + 1, path);
	        }

	        if (!found) {
	            grid[r][c] = false;
	            path.delete(path.length() - 2, path.length());
	        }
	    }
	}
