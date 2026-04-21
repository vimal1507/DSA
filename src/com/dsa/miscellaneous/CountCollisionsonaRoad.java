package com.dsa.miscellaneous;

import java.util.Stack;

public class CountCollisionsonaRoad {

	public static void main(String[] args) {
		System.out.println(countCollisions("RLRSLL"));

	}

	public static int countCollisions(String directions) {
		Stack<Character> s = new Stack<>();
		int count = 0;
		for (int i = 0; i < directions.length(); i++) {
			if (directions.charAt(i) == 'R') {
				s.push(directions.charAt(i));
			} else if (!s.isEmpty() && s.peek() == 'R' && directions.charAt(i) == 'L') {
				count = count + 2;
				s.pop();
				s.push('S');
			} else if (!s.isEmpty() && s.peek() == 'S' && directions.charAt(i) == 'L') {
				count++;
			} else if (!s.isEmpty() && s.peek() == 'R' && directions.charAt(i) == 'S') {
				count++;
				s.pop();
				s.push('S');
			} else if (s.isEmpty() && directions.charAt(i) == 'S') {
				s.push('S');
			}
		}

		char temp = '*';
		while (!s.isEmpty()) {
			if (s.peek() == 'S') {
				temp = s.peek();
			}
			if (temp == 'S' && s.peek() == 'R') {
				count++;
			}
			s.pop();
		}
		return count;
	}

}
