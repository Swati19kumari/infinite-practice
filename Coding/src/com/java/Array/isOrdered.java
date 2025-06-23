package com.java.Array;

public class isOrdered {
	
	public static boolean checking(float arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;//Not in ascending order
				
			}
		}
	return true;
	}

	public static void main(String[] args) {
		
		float arr[]= {42,4,12,84,19,20,20,24,27};
		if(checking(arr)) {
			System.out.println("in order");
		}
		else {
			System.out.println("Not in order");
		}
	}
}
