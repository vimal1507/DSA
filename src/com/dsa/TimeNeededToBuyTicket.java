package com.dsa;

import java.util.Stack;

public class TimeNeededToBuyTicket {

	public static void main(String[] args) {
		System.out.println(timeRequiredToBuy(new int[] {2,3,2},2));
	}
	    public static int timeRequiredToBuy(int[] tickets, int k) {
	        Stack<Integer> s = new Stack<>();
	        int res = 0;
	        int n = tickets.length;
	        for(int i = n-1;i>=0;i--){
	            s.push(i);
	        }
	        while(tickets[k] != 0){
	            int personIndex = s.pop();
	            tickets[personIndex]--;
	            res++;

	            if(tickets[k] == 0 && k == personIndex)
	                return res;
	            Stack<Integer> temp = new Stack<>();
	            while(!s.isEmpty()){
	                temp.push(s.pop());
	            }

	            if(tickets[personIndex] > 0){
	                s.push(personIndex);
	            }  

	            while(!temp.isEmpty()){
	                s.push(temp.pop());
	            }    
	        }

	        return res;
	        
	    }
}


