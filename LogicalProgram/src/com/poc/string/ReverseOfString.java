package com.poc.string;

public class ReverseOfString {

	public static void main(String[] args) {
		String s = "Manku";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
