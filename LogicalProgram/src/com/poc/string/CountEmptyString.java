package com.poc.string;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {

	public static void main(String[] args) {
		List<String> arrStr = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		// Count empty strings
		long count = arrStr.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Empty Count: " + count);
	}

}
