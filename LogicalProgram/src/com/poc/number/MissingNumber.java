package com.poc.number;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };
		int missNumber = getMissingNo(a, 5);
		System.out.println(missNumber);
	}

	public static int getMissingNo(int[] a, int n) {
		int total;
		total = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < n; i++) {
			total = total - a[i];
		}
		return total;
	}
}
