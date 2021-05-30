package com.poc.string;

public class NoOfOccurenceOfCharacters1 {

	public static void main(String[] args) {
		String str = "Bibhanshu";
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + " " + count);
				count = 0;
			}
		}
	}
}
