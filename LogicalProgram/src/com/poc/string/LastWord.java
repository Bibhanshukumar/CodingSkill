package com.poc.string;

public class LastWord {

	public static void main(String[] args) {
		String s1 = "$value for 2$";
		String[] words = s1.split(" ");
		System.out.println(words.length);
		String str = words[words.length - 1];
		System.out.println(str);

	}
}
