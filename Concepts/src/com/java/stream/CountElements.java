package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class CountElements {

	public static void main(String[] args) {
		List<Integer>num=Arrays.asList(10,12,13,8,4);
		
		long count=num.stream()
				.filter(n -> n>10)
				.count();
		System.out.println(count);
		
	}
}
