package com.dsa.array;

public class SecondOccurance {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 6, 7, 1, 0, 1, 2, 1 };
		int target = 1;

		int index = findOccurance(arr, target);

		if (index != -1) {
			System.out.println("SecondOccurance Found at index: " + index);
		} else {
			System.out.println("SecondOccurance not found !");
		}
	}

	private static int findOccurance(int[] arr, int target) {
		int count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == target) {
				count++;
				if (count == 2) {
					return i;
				}

			}
		}

		return -1;
	}
}
