package com.poc.number;

public class CountDuplicateElement {

	public static void main(String[] args) {
		int[] array = { 5, 3, 1, 6, 8, 1, 9, 1, 8 };
		int count = 0, element = 0 ;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					element = array[i];
				}
			}
		}
		System.out.println("Duplicate element is: " + element + " and count the no. is " + count);
	}
}
