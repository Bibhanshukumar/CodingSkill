package com.poc.number;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
		int count = 0;
		System.out.println("Original Arrays: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			}
		}
		for (int j = 0; j < count; j++) {
			arr[j] = 0;
		}
		for (int k = count; k < arr.length; k++) {
			arr[k] = 1;
		}
		System.out.println("After sorting Arrays: " + Arrays.toString(arr));
	}
}
