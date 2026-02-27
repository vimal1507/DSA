package com.dsa.graph;

public class WordSearch {

	public static void main(String[] args) {
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.out.println(exist(board,word));

	}
	
	public static boolean exist(char[][] board, String word) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, String word,
                       int a, int b, int index){

        if(index == word.length())
            return true;

        if(a < 0 || b < 0 ||
           a >= board.length ||
           b >= board[0].length ||
           board[a][b] != word.charAt(index))
            return false;

        char temp = board[a][b];
        board[a][b] = '#';

        boolean found =
            dfs(board, word, a+1, b, index+1) || 
            dfs(board, word, a-1, b, index+1) || 
            dfs(board, word, a, b+1, index+1) || 
            dfs(board, word, a, b-1, index+1);   

        board[a][b] = temp;

        return found;
    }

}
