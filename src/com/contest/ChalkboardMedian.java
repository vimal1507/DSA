package com.contest;

import java.util.Collections;
import java.util.PriorityQueue;

public class ChalkboardMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



 class codeforces {
    public void solve() {
        int x = 1;//in.readInt();
        int q = 2;//in.readInt();
        PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();
        left.offer(x);
        for(int i=0; i<q; i++){
            int a = 3;//in.readInt();
            int b = 4;//in.readInt();
            if(!left.isEmpty() && left.peek() > a){
                left.offer(a);
            }else{
                right.offer(a);
            }
            if(!left.isEmpty() && left.peek() > b){
                left.offer(b);
            }else{
                right.offer(b);
            }
            while (left.size() > right.size() && left.size() - right.size() != 1){
                right.offer(left.poll());
            }
            while(right.size() >= left.size()){
                left.offer(right.poll());
            }
            System.out.println(left.peek());
        }

    }
}
