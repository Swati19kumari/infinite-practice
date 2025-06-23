package com.java.String;

public class CountPalindromeWord {
	
	public static void count(String str) {
		str=str.toLowerCase();
		int c=0;
		String data[]=str.trim().split(" ");
		for(int i=0;i<data.length;i++) {
			String rev=new StringBuilder(data[i]).reverse().toString();
			if(data[i].equals(rev)) {
				c++;
				System.out.println(data[i]);
			}
		}
		System.out.println(c);
	}

	public static void main(String[] args) {
		String str1="Madam Arora teaches malayalam";
		String str2=" Nitin speaks malayalam";
//		count(str1);
		count(str2);
	}
}
