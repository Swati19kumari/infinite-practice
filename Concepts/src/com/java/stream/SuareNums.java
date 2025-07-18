package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SuareNums {
	
	//Square and Filter Numbers
	
	public static void main(String[] args) {
		List<Integer>nums=Arrays.asList(1,2,3,4,5);
		
		List<Integer> evenSquares=nums.stream()
				.map(n -> n * n)
				.filter(square -> square%2==0)
				.collect(Collectors.toList());
		
		System.out.println(evenSquares);
		
}
}
