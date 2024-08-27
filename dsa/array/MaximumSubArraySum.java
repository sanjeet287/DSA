package com.dsa.array;

public class MaximumSubArraySum {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = maxSubArray(arr);
		System.out.println("MaxSubArray Sum="+maxSum);
	}

	private static int maxSubArray(int[] arr) {
		
		int maxSum=Integer.MIN_VALUE;
		int currentSum = arr[0];

        for (int j : arr) {
            currentSum = Math.max(j, currentSum + j);

            maxSum = Math.max(maxSum, currentSum);
        }
		return maxSum;
	}

}
