package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class MinStackImpl {

	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(3);
		s.push(8);
		s.push(7);
		s.push(1);
		s.push(12);
		System.out.println(s.top());
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.getMin());
		
		

	}

}
class MinStack {
    private List<int[]> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(new int[]{val,val});
        }else{
            int cur_min = stack.get(stack.size()-1)[1];
            stack.add(new int[]{val,Math.min(val,cur_min)});
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.remove(stack.size()-1);
        }
    }
    
    public int top() {
        return stack.get(stack.size()-1)[0];
    }
    
    public int getMin() {
        return stack.get(stack.size()-1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
