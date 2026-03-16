package com.dsa.String;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWord {

	public static void main(String[] args) {
		 List<String>dictionary = new ArrayList<>();
		 dictionary.add("cat");
		 dictionary.add("bat");
		 dictionary.add("rat");
		 String sentence = "the cattle was rattled by the battery";
		 System.out.println(replaceWords(dictionary,sentence));

	}

	    public static String replaceWords(List<String> dictionary, String sentence) {
	        String[] sa = sentence.split(" ");
	        for(int i=0; i<dictionary.size(); i++){
	            for(int j=0; j<sa.length; j++){
	                if(sa[j].startsWith(dictionary.get(i))){
	                    sa[j] = dictionary.get(i);
	                }
	            }
	        }
	        StringBuilder s = new StringBuilder();
	        for(int i=0; i<sa.length; i++){
	            s.append(sa[i]);
	            s.append(" ");
	        }
	        return s.toString().trim();
	    }

}
