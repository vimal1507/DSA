package com.dsa.String;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		String result = convertToTitle(56);
		System.out.println(result);

	}

	public static String convertToTitle(int columnNumber) {
		StringBuilder sb = new StringBuilder();
		while (columnNumber > 0) {
			columnNumber--;
			sb.append((char) ('A' + columnNumber % 26));
			columnNumber = columnNumber / 26;
		}
		return sb.reverse().toString();
	}

}
