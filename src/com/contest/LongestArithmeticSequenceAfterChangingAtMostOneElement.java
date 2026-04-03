package com.contest;

public class LongestArithmeticSequenceAfterChangingAtMostOneElement {

	public static void main(String[] args) {
		int[] nums = {9,7,5,10,1};
		System.out.println(longestArithmetic(nums));

	}

	public static int longestArithmetic(int[] nums) {
		int n = nums.length;
		int ans = 0;
		int i = 1;

		while (i < n) {

			int start = i - 1;
			int d = nums[i] - nums[i - 1];

			i++;
			while (i < n && nums[i] - nums[i - 1] == d)
				i++;

			ans = Math.max(ans, i - Math.max(start - 1, 0));
			if (start >= 2 && nums[start] - nums[start - 2] == 2 * d)
				ans = Math.max(ans, i - (start - 2));

			if (i == n)
				break;

			ans = Math.max(ans, i - start + 1);
			if (i + 1 < n && nums[i + 1] - nums[i - 1] == 2 * d) {
				int j = i + 2;
				while (j < n && nums[j] - nums[j - 1] == d)
					j++;
				ans = Math.max(ans, j - start);
			}
		}

		return ans;
	}

}
