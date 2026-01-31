package com.dsa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorial {
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int T = Integer.parseInt(br.readLine().trim());
	        
	        while (T-- > 0) {
	            long n = Long.parseLong(br.readLine().trim());
	            System.out.println(trailingZeros(n));
	        }
	    }

	    public static long trailingZeros(long num) {
	        long result = 0;
	        while (num > 0) {
	            num /= 5;
	            result += num;
	        }
	        return result;
	    }
	}
