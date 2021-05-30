package com.poc.number;

import java.util.Arrays;

public class ReverseNumber {
	public static void main(String[] args) {

		int arrIn[] = { 10, 4, 7, 6, 1, 10 };
		int temp = 0;

		for (int i = arrIn.length - 1; i >= 0; i--) {
			System.out.print(arrIn[i] + ",");
		}
		System.out.println(" ");
		for (int i = 0; i < arrIn.length / 2; i++) {
			temp = arrIn[i];
			arrIn[i] = arrIn[arrIn.length - i - 1];
			arrIn[arrIn.length - i - 1] = temp;
		} // for
		System.out.println(Arrays.toString(arrIn));
	}
}
