package com.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualToK {

	public static void main(String[] args) {

		int[] arr = { 1, 2, -1, -4, 3, 5, -1 };
		int target = 3;

		List<List<Integer>> result = findTriplet(arr, target);
		
		System.out.println("Triplets  Sum equal to Target :");
		for(List<Integer> triplet:result) {
			System.out.println(triplet);
		}
	}

	private static List<List<Integer>> findTriplet(int[] arr, int target) {

		int n = arr.length;
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(arr==null || arr.length<3)return result;
		
		Arrays.sort(arr);
		
		for(int i=0;i<n-2;i++) {
			
			if(i>0 && arr[i]==arr[i-1])continue;
			
			int left=i+1;
			int right=n-1;
			
			while(left<right) {
				
				int sum=arr[left]+arr[right]+arr[i];
				
				if(sum==target) {
					result.add(Arrays.asList(arr[i],arr[left],arr[right]));
					
					while(left<right  && arr[left]==arr[left+1])left++;
					
					while(left<right  && arr[right]==arr[right-1])right--;
					
					left++;
					right--;
				}else if(sum<target) {
					left++;
				}else {
					right--;
				}
			}
		}
		return result;
	}

}