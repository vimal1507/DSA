package com.contest;

public class Fishbones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void solve() {
        int n = 5;//in.readInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
//            a[i] = in.readInt();
//            b[i] = in.readInt();
        }

        int m = 8;//in.readInt();
        String[] s = new String[m];

        boolean[][] c = new boolean[n][26];

        for (int i = 0; i < m; i++) {
//            s[i] = in.readString();
            String current = s[i];

            for (int j = 0; j < n; j++) {
                if (current.length() == a[j]) {
                    int charIdx = current.charAt(b[j] - 1) - 'a';
                    c[j][charIdx] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            String candidate = s[i];

            if (candidate.length() != n) {
                System.out.println("No");
            } else {
                boolean f = true;
                for (int j = 0; j < n; j++) {
                    int spineCharIdx = candidate.charAt(j) - 'a';
                    if (!c[j][spineCharIdx]) {
                        f = false;
                        break;
                    }
                }
                
                if (f) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

}
