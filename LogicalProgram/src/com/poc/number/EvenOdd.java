package com.poc.number;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[] = { 10, 4, 5, 7 };
		for (int i = 0; i < arr.length; i++) {// for(int i:arr){
			int n = arr[i];
			if (n % 2 == 0) {
				System.out.println("Even Number:" + n);
			} // if
			else {
				System.out.println("Odd Number:" + n);
			} // else
		} // for
	}// main
}
