package com.dsa.array;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,6};
		int n=arr.length;
		int missingNo=findMissing(arr,n);
		System.out.println(missingNo);
	}

	private static int findMissing(int[] arr, int n) {
		
		int sum=0;
		int expectedSum=n*(n+1)/2;
		
		for(int i=0;i<n-1;i++) {
		
			sum+=arr[i];	
		}
		
		return expectedSum-sum;
		
	}

}
