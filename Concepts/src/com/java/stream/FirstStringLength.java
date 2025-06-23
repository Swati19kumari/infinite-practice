package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstStringLength {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","kiwi","grapefruit");
		
		Optional<String>first=words.stream()
				.filter(word->word.length()>5)
				.findFirst();
		System.out.println(first.orElse("Not Found"));
	}
}
