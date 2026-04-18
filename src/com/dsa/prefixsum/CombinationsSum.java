package com.dsa.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class CombinationsSum {

	public static void main(String[] args) {
		System.out.println(combinationSum(new int[] {2,3,6,7}, 7));

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		combination(candidates, 0, new ArrayList<>(), target, 0, result);
		return result;
	}

	private static void combination(int[] candidates, int idx, List<Integer> temp, int target, int sum,
			List<List<Integer>> result) {
		if (sum == target) {
			result.add(new ArrayList<>(temp));
			return;
		}
		if (idx == candidates.length || sum > target) {
			return;
		}

		temp.add(candidates[idx]);
		combination(candidates, idx, temp, target, sum + candidates[idx], result);
		// combination(candidates, idx+1, temp, target, sum+candidates[idx], result); //mai yaha pe galti kr ra tha fir samjh aa gya
		temp.remove(temp.size() - 1);
		combination(candidates, idx + 1, temp, target, sum, result);

	}
}
