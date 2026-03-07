package com.dsa.graph;

public class KnightJourney {

	public static void main(String[] args) {
		solve();

	}

	    static boolean found;

	    public static void solve() {

	        int t = 1;//in.readInt();

	        for(int tc=1; tc<=t; tc++){

	            int n = 4;//in.readInt();
	            int m = 3;//in.readInt();

	            boolean[][] grid = new boolean[n][m];
	            StringBuilder path = new StringBuilder();

	            found = false;

	            dfs(grid,0,0,1,path);

	            System.out.println("Scenario #"+tc+":");

	            if(found)
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
	                     StringBuilder path){

	        if(found) return;

	        if(r<0 || c<0 ||
	                r>=grid.length ||
	                c>=grid[0].length ||
	                grid[r][c])
	            return;

	        grid[r][c] = true;

	        path.append((char)('A'+c));
	        path.append(r+1);

	        if(count == grid.length*grid[0].length){
	            found = true;
	            return;
	        }

	       
	        dfs(grid, r - 1, c - 2, count + 1, path); // Move 1: c-2, r-1
            dfs(grid, r + 1, c - 2, count + 1, path); // Move 2: c-2, r+1
            dfs(grid, r - 2, c - 1, count + 1, path); // Move 3: c-1, r-2
            dfs(grid, r + 2, c - 1, count + 1, path); // Move 4: c-1, r+2
            dfs(grid, r - 2, c + 1, count + 1, path); // Move 5: c+1, r-2
            dfs(grid, r + 2, c + 1, count + 1, path); // Move 6: c+1, r+2
            dfs(grid, r - 1, c + 2, count + 1, path); // Move 7: c+2, r-1
            dfs(grid, r + 1, c + 2, count + 1, path); // Move 8: c+2, r+1

	      
	        if(!found){
	            grid[r][c]=false;
	            path.delete(path.length()-2,path.length());
	        }
	    }

}
