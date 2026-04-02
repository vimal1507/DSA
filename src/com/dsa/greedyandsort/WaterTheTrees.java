package com.dsa.greedyandsort;

public class WaterTheTrees {

	public static void main(String[] args) {
		 int n = 7;//in.readInt();
	        long[] h = {2, 5, 4, 8, 3, 7, 4};//in.readLongArray(n);
	        long max = 0;
	        for(int i=0; i<n; i++){
	            max = Math.max(max,h[i]);
	        }
	        long ans = Math.min(calculate(h, max), calculate(h, max + 1));
	        System.out.println(ans);

	}


    private static long calculate(long[] h, long target) {
        long ones = 0, twos = 0;

        for (long height : h) {
            long diff = target - height;
            twos += diff / 2;
            ones += diff % 2;
        }

        if (twos > ones) {
            long shift = (twos - ones) / 3;
            ones += shift * 2;
            twos -= shift;

            if (twos - ones > 1) {
                twos--;
                ones += 2;
            }
        }

        if (ones > twos) {
            return ones * 2 - 1;
        } else {
            return twos * 2;
        }
    }

}
