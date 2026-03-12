package com.dsa.graph.shortestpath;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MakeTwiIntegerEqual {

	public static void main(String[] args) {
		System.out.println(minOperations(10,12));

	}

	    public static int minOperations(int n, int m) {

	        int limit = 10000;

	        boolean[] prime = sieve(limit);

	        if(prime[n] || prime[m]) return -1;

	        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
	        Map<Integer,Integer> dist = new HashMap<>();

	        pq.offer(new int[]{n, n});
	        dist.put(n, n);

	        while(!pq.isEmpty()){

	            int[] cur = pq.poll();
	            int num = cur[0];
	            int cost = cur[1];

	            if(num == m) return cost;

	            char[] digits = String.valueOf(num).toCharArray();

	            for(int i=0;i<digits.length;i++){

	                char original = digits[i];

	                if(digits[i] < '9'){
	                    digits[i]++;
	                    int next = Integer.parseInt(new String(digits));

	                    if(!prime[next]){
	                        int newCost = cost + next;

	                        if(!dist.containsKey(next) || newCost < dist.get(next)){
	                            dist.put(next,newCost);
	                            pq.offer(new int[]{next,newCost});
	                        }
	                    }
	                }

	                digits[i] = original;

	                if(digits[i] > '0'){
	                    digits[i]--;
	                    int next = Integer.parseInt(new String(digits));

	                    if(!prime[next]){
	                        int newCost = cost + next;

	                        if(!dist.containsKey(next) || newCost < dist.get(next)){
	                            dist.put(next,newCost);
	                            pq.offer(new int[]{next,newCost});
	                        }
	                    }
	                }

	                digits[i] = original;
	            }
	        }

	        return -1;
	    }

	    private static boolean[] sieve(int n){

	        boolean[] prime = new boolean[n+1];
	        Arrays.fill(prime,true);

	        prime[0] = false;
	        prime[1] = false;

	        for(int i=2;i*i<=n;i++){
	            if(prime[i]){
	                for(int j=i*i;j<=n;j+=i){
	                    prime[j] = false;
	                }
	            }
	        }

	        return prime;
	    }
}
