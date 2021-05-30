package com.poc.number;

public class CountMaxRepeatation {

	public static void main(String[] args) {
		int[] arrIn = { 1, 3, 2, 4, 2, 3, 2, 3, 0, 3 };
		int count = 0, element = 0;
		for (int i = 0; i < arrIn.length; i++) {
			int tempCount = 1;
			for (int j = i + 1; j < arrIn.length; j++) {
				if (arrIn[i] == arrIn[j]) {
					tempCount++;
				} // if
			} // for
			if (tempCount > count) {
				element = arrIn[i];
				count = tempCount;
			}
		} // for
		System.out.println("Repeat of digit : " + element);
		System.out.println("Count of digit : " + count);
	}// main
}// class
