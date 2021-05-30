package com.poc.string;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		System.out.println(words.length);
	}
}
