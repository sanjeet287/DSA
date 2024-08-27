package com.dsa.array;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSumZeroes {

	public static void main(String[] args) {

		int[] arr = { 1, -1, 4, -3, -4, 3, 2, -2 };

		int target = 0;

		ArrayList<int[]> result = findPair(arr, target);

		for (int[] pair : result) {

			System.out.println("{ " + pair[0] + "," + pair[1] + "}");
		}

	}

	private static ArrayList<int[]> findPair(int[] arr, int target) {

		HashMap<Integer, Integer> sumMap = new HashMap<>();

		ArrayList<int[]> pairs = new ArrayList<int[]>();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			int complement = target - arr[i];

			if (sumMap.containsKey(complement)) {
				count += sumMap.get(complement);

				pairs.add(new int[] { complement, arr[i] });

			}

			sumMap.put(arr[i], sumMap.getOrDefault(arr[i], 0) + 1);

		}
		System.out.println("No of Pairs :" + count);
		return pairs;
	}
}
