package com.dsa.String;

public class AddString {

	public static void main(String[] args) {
		String num1 = "11";
		String num2 = "123";
		System.out.println(addStrings(num1, num2));

	}

	public static String addStrings(String num1, String num2) {
		while (num1.length() > num2.length()) {
			num2 = "0" + num2;
		}
		while (num1.length() < num2.length()) {
			num1 = "0" + num1;
		}
		char[] num3 = num1.toCharArray();
		char[] num4 = num2.toCharArray();
		char[] res = new char[num4.length];
		int carry = 0;
		for (int i = num3.length - 1; i >= 0; i--) {
			int a = num3[i] - '0';
			int b = num4[i] - '0';
			int sum = a + b + carry;
			res[i] = (char) ((sum % 10) + '0');
			carry = sum / 10;
		}
		String s = new String(res);
		if (carry > 0) {
			s = carry + s;
		}
		return s;
	}
}
