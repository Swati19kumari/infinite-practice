package com.java.String;

public class isPalindrome {
	public static boolean Palindrome(String s) {
//		int left=0;
//		int right=s.length()-1;
//		while(left<=right)
//		{
//			if(s.charAt(left)!=s.charAt(right)) {
//				return false;}
//			
//		left++;
//		right--;
//		}
//	return true;
		
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		
		if(rev.equals(s)) {
			return true;
		}
		return false;

}

	public static void main(String[] args) {
		String s="abbc";
		if(Palindrome(s)) {
			System.out.println("yes it is palindrome");
			
		}
		else {
			System.out.println("no it is not");
		}
	}
}
