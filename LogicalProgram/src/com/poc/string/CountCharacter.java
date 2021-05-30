package com.poc.string;

public class CountCharacter {

	public static void main(String[] args) {
		String str = "All is Well";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total numbers of Characters in a String: " + count);
	}
}
