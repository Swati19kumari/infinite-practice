package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterName {
	
	public static void main(String[] args) {
		//Filter names starting with a specific letter
		//Given a list of names, return only those starting with "A".
		
		List<String>names=Arrays.asList("Alice","Bob","Annie","David","Amit");
		
		List<String> result=names.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(result);
			
	}

	
}
