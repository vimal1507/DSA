package com.contest;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GoStright {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};
    char[] dirChars = {'U', 'D', 'L', 'R'};

    static class State {
        int r, c, d;
        State(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

    public void solve() {
        int H = 3;//in.readInt();
        int W = 5;//in.readInt();

        char[][] grid = new char[H][W];
        int startR = -1, startC = -1;

        for (int i = 0; i < H; i++) {
            String line = "";//in.readString();
            for (int j = 0; j < W; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'S') {
                    startR = i;
                    startC = j;
                }
            }
        }


        byte[][][] parentDir = new byte[H][W][4];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                Arrays.fill(parentDir[i][j], (byte)-1);
            }
        }

        Queue<State> q = new LinkedList<>();

        for (int d = 0; d < 4; d++) {
            int nr = startR + dr[d];
            int nc = startC + dc[d];
            if (nr >= 0 && nr < H && nc >= 0 && nc < W && grid[nr][nc] != '#') {
                q.add(new State(nr, nc, d));
                parentDir[nr][nc][d] = (byte)d;
            }
        }

        int endR = -1, endC = -1, endD = -1;

        while (!q.isEmpty()) {
            State curr = q.poll();

            if (grid[curr.r][curr.c] == 'G') {
                endR = curr.r;
                endC = curr.c;
                endD = curr.d;
                break;
            }

            char cell = grid[curr.r][curr.c];

            for (int d = 0; d < 4; d++) {
                boolean canMove = false;

                if (cell == '.' || cell == 'S' || cell == 'G') {
                    canMove = true;
                } else if (cell == 'o') {
                    if (d == curr.d) canMove = true; // सिर्फ सीधा
                } else if (cell == 'x') {
                    if (d != curr.d) canMove = true; // मुड़ना पड़ेगा
                }

                if (canMove) {
                    int nr = curr.r + dr[d];
                    int nc = curr.c + dc[d];

                    if (nr >= 0 && nr < H && nc >= 0 && nc < W &&
                            grid[nr][nc] != '#' && parentDir[nr][nc][d] == -1) {

                        parentDir[nr][nc][d] = (byte)curr.d;
                        q.add(new State(nr, nc, d));
                    }
                }
            }
        }

        if (endR == -1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            StringBuilder path = new StringBuilder();
            int currR = endR, currC = endC, currD = endD;

            while (true) {
                path.append(dirChars[currD]);
                int prevD = parentDir[currR][currC][currD];

                int tr = currR - dr[currD];
                int tc = currC - dc[currD];

                if (tr == startR && tc == startC) break;

                currR = tr;
                currC = tc;
                currD = prevD;
            }
            System.out.println(path.reverse().toString());
        }
    }

}
