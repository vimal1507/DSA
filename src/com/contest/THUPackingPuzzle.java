package com.contest;

public class THUPackingPuzzle {

	public static void main(String[] args) {
		solve();

	}
	public static void solve() {
        long ct = 1;
        long ch = 1;
        long cu = 0;

        if (ct <= cu) {
            System.out.println(3 * (ch + cu) + ct);
        } else {
            long ans = 3 * (ch + cu) + 2 * ct - cu;
            if (ct > cu + 2 * ch) {
                ans += 1;
            }
            System.out.println(ans);
        }
    }

}
