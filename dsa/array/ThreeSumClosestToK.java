package com.dsa.array;

public class ThreeSumClosestToK {

	public static void main(String[] args) {
		
		int[] arr = {-1, 2, 1, -4};
        int target = 1;
        
        int closestSum=closestSum(arr,target);
        System.out.println("closestSum= "+closestSum);
	}

	private static int closestSum(int[] arr, int target) {
		
		if(arr==null || arr.length<3)return 0;
		
		int closestSum=arr[0]+arr[1]+arr[2];
		
		int left=0,right=arr.length-1;
		
		for(int i=0;i<arr.length-2;i++) {
			
			int sum=arr[left]+arr[right]+arr[i];
			
			if(Math.abs(sum-target)<Math.abs(closestSum-target)) {
				closestSum=sum;				
			}
			
			if(sum==target) {
				return sum;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		return closestSum;
	}
}
