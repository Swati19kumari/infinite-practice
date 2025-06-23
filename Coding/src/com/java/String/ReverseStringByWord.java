package com.java.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringByWord {

	
//	 public static void  reverseWords(String s) {
//		 List<String>temp=new ArrayList<>();
//	       String str[]=s.split(" ");
//	       
//	       for (String string : str) {
//	    	   if(!string.isEmpty()) {
//	    		   temp.add(string);
//			
//		}
//	    	   
//	       }
//	       Collections.reverse(temp);
//	       
//	       System.out.println(temp);
//	    } 
	
	static  String reverseWords(String s) {
		String words[]=s.trim().split("\\s+");
		StringBuilder rev=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			rev.append(words[i]);
			
			if(i!=0) {
				rev.append(" ");
			}
		}
		return rev.toString();
	}
	 
	 public static void main(String[] args) {
		
		 
//		 Input: s = "welcome to the jungle"
		 
//		 Output: "jungle the to welcome"
		 String s="welcome to the   jungle";
		 System.out.println(reverseWords(s));  
		 
	}
	
}
