package com.contest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MultiSourceFloodFill {

	public static void main(String[] args) {
		int n = 3, m = 3;
		int[][] sources = {{0,0,1},{2,2,2}};
		int[][] res =colorGrid(n, m, sources);
		for(int[] x : res) {
			for(int k : x) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}
	public static int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] result = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        Arrays.sort(sources, (a, b) -> b[2] - a[2]);

        Queue<int[]> q = new LinkedList<>();

        for (int[] s : sources) {
            int r = s[0], c = s[1], color = s[2];
            result[r][c] = color;
            visited[r][c] = true;
            q.offer(new int[]{r, c, color});
        }

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1], color = cur[2];

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    result[nr][nc] = color;
                    q.offer(new int[]{nr, nc, color});
                }
            }
        }

        return result;
    }

}
