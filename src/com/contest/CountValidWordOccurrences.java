package com.contest;

public class CountValidWordOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] countWordOccurrences(String[] chunks,String[] queries) {
        String s = String.join("", chunks);
        s = s.replace("--", "  ")
             .replace(" -", "  ")
             .replace("- ", "  ");

        while(s.startsWith("-")) {
            s = s.substring(1);
        }

        while(s.endsWith("-")) {
            s = s.substring(0, s.length() - 1);
        }

        String[] words = s.trim().split(" ");

        Map<String,Integer> freq = new HashMap<>();

        for(String word : words) {

            if(word.length() == 0) {
                continue;
            }

            freq.put(word,freq.getOrDefault(word, 0) + 1);
        }

        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            ans[i] = freq.getOrDefault(queries[i], 0);
        }

        return ans;
    }

}
