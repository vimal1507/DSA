package com.dsa.prefixsum;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		System.out.println(combine(5,2));

	}
	
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combination(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    private static void combination(int n, int k, int idx, List<Integer> temp, List<List<Integer>> res) {
        
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i <= n; i++) {
            temp.add(i);
            combination(n, k, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

}
