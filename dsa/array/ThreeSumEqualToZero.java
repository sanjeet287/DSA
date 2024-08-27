package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualToZero {

	public static void main(String[] args) {

		int[] arr = { -1, 0, 1, 2, -1, -4 };

		List<List<Integer>> result = findTriplet(arr);
		System.out.println("Triplets Sum equal to Zero :");
		for(List<Integer> triplet:result) {
			System.out.println(triplet);
		}
	}

	private static List<List<Integer>> findTriplet(int[] arr) {

		List<List<Integer>> result = new ArrayList<>();

		if (arr.length < 3)
			return result;

		Arrays.sort(arr);  //O(nlogn)

		int n = arr.length;

		for (int i = 0; i < n - 2; i++) {

			// Avoid duplicates for the first number
			if (i > 0 && arr[i] == arr[i - 1])
				continue;

			int left = i + 1;
			int right = n - 1;
			int target = -arr[i];

			while (left < right) {

				int sum = arr[left] + arr[right];

				if (sum ==target) {
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));

					while (left < right && arr[left] == arr[left + 1])
						left++;

					while (left < right && arr[right] == arr[right - 1])
						right--;

					left++;
					right--;

				} else if (sum < target) {
					left++;
				} else {
					right--;
				}
			}
		}

		return result;

	}

}
