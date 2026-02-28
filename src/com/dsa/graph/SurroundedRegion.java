package com.dsa.graph;

public class SurroundedRegion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	    public void solve(char[][] board) {
	        int m = board.length;
	        int n = board[0].length;
	        for(int i=0; i < m; i++){
	            dfs(board,i,0);
	            dfs(board,i,n-1);
	        }

	        for(int j=0; j < n; j++){
	            dfs(board,0,j);
	            dfs(board,m-1,j);
	        }

	        for(int r=0; r<m; r++){
	            for(int c=0; c<n; c++){
	                if(board[r][c] == 'O')
	                    board[r][c] = 'X';
	                else if(board[r][c] == '#')
	                    board[r][c] = 'O';    
	            }
	        }
	    }

	    public static void dfs(char[][] board, int r, int c){
	        if(r < 0 || r >= board.length || 
	        c < 0 || c >= board[0].length || board[r][c] != 'O')
	            return;
	        board[r][c] = '#';

	        dfs(board,r-1,c); 
	        dfs(board,r+1,c); 
	        dfs(board,r,c+1); 
	        dfs(board,r,c-1);    
	    }
}
