package com.poc.number;

import java.util.Arrays;

public class SortTheArray {

	public static void main(String[] args) {
		int arrIn[] = { 10, 15, 0, 1, 1, 3, 8, 3, 15, 0 };
		// int arrIn[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
		int temp = 0;
		for (int i = 0; i < arrIn.length; i++) {
			for (int j = i + 1; j < arrIn.length; j++) {
				if (arrIn[i] >= arrIn[j]) {
					temp = arrIn[i];
					arrIn[i] = arrIn[j];
					arrIn[j] = temp;
				}
			}
		}
		for (int i = 0; i < arrIn.length; i++) {
			System.out.print(arrIn[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(arrIn));
	}
}
