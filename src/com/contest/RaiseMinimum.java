package com.contest;

public class RaiseMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void solve() {
        int n = 6;//in.readInt();
        long k = 4;//in.readLong();
        long[] arr = {};//in.readLongArray(n);
        long min = Long.MAX_VALUE;
        for(int i=0; i<n; i++){
            min = Math.min(arr[i],min);
        }
        long max = (long)2e18;

        while(min <= max){
            long mid = min+(max-min)/2;
            if(can(mid,arr,k)){
                min = mid+1;
            }else{
                max = mid-1;
            }
        }
        System.out.println(max);
    }

    private boolean can(long target, long[] arr, long k){
        long used = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < target){
                long diff = target - arr[i];
                used += (diff + i) / (i + 1);
                if(used > k){
                    return false;
                }
            }
        }

        return used <= k;
    }

}
