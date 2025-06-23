package com.java.Array;

import java.util.Arrays;

public class EliminateDuplicates {

	public static void main(String[] args) {
		int arr[]= {58,26,26,70,70,91,58,58,66};
		Arrays.sort(arr);
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		System.out.println(j+1);
		
	}
}
