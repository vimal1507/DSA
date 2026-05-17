package com.contest;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LongSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void solve() {
		long n = 3;//in.readLong();
		long k = 4;//in.readLong();
		;
		List<List<Long>> ls = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			List<Long> temp = new ArrayList<>();
			long m = 2;//in.readLong();
			for (int j = 0; j < m; j++) {
				//temp.add(in.readLong());
			}
			ls.add(temp);
		}
		int[] b = {};//in.readIntArray((int) n);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			long a = b[i];
			long size = ls.get(i).size();
			if (sum + a * size < k) {
				sum = sum + a * size;
			} else {
				long pos = k - sum - 1;
				int idx = (int) (pos % size);
				System.out.println(ls.get(i).get(idx));
				return;
			}
		}
	}

}
