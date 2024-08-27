package com.dsa.array;

public class SquareThenSort {

public static void main(String[] args) {
		
		int arr[] = { -6, -3, -1, 2, 4, 5 };
		
		squaredArray(arr);
	}

	private static void squaredArray(int[] arr) {
		
		int n=arr.length;
		int left=0,right=arr.length-1;
		int [] result=new int[arr.length];
		
		for(int idx=n-1;idx>=0;idx--) {
			
			if(Math.abs(arr[left])>arr[right]) {
				result[idx]=arr[left]*arr[left];
				left++;
			}else {
				result[idx]=arr[right]*arr[right];
				right--;
			}
		}
		
		for(int num:result) {
			System.out.print(num+" ");
		}	
		
	}
}
