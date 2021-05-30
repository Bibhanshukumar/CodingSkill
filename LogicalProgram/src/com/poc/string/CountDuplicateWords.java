package com.poc.string;

public class CountDuplicateWords {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		int count;
		string = string.toLowerCase();
		String[] words = string.split(" ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println("Word is '" + words[i] + "' and Repeated of word: " + count + " times.");
			}
		}
	}
}
