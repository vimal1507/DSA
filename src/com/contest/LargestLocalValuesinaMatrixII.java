package com.contest;

public class LargestLocalValuesinaMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	    public int countLocalMaximums(int[][] matrix) {
	        int n = matrix.length;
	        int m = matrix[0].length;

	        int[][] cnt = new int[n][m];
	        int ans = 0;

	        for (int num = 200; num >= 1; num--) {
	            int[][] pre = new int[n + 1][m + 1];
	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < m; j++) {
	                    pre[i + 1][j + 1] = cnt[i][j] + pre[i][j + 1] + pre[i + 1][j] - pre[i][j];
	                }
	            }

	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < m; j++) {
	                    if (matrix[i][j] != num) {
	                        continue;
	                    }

	                    int x1 = Math.max(0, i - num);
	                    int y1 = Math.max(0, j - num);
	                    int x2 = Math.min(n - 1, i + num);
	                    int y2 = Math.min(m - 1, j + num);

	                    int c = pre[x2 + 1][y2 + 1] - pre[x1][y2 + 1] - pre[x2 + 1][y1] + pre[x1][y1];

	                    if (x1 == i - num && y1 == j - num && cnt[x1][y1] == 1) c--;
	                    if (x1 == i - num && y2 == j + num && cnt[x1][y2] == 1) c--;
	                    if (x2 == i + num && y2 == j + num && cnt[x2][y2] == 1) c--;
	                    if (x2 == i + num && y1 == j - num && cnt[x2][y1] == 1) c--;

	                    if (c == 0) {
	                        ans++;
	                    }
	                }
	            }

	            for (int i = 0; i < n; i++) {
	                for (int j = 0; j < m; j++) {
	                    if (matrix[i][j] == num) {
	                        cnt[i][j] = 1;
	                    }
	                }
	            }
	        }

	        return ans;
	    }

}
