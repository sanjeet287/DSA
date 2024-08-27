package com.dsa.recursion;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int n=arr.length-1;
		System.out.println("Before Reversing Array");
		printArray(arr,0, n);
		reverse(arr,0,n);
		System.out.println("After Reversing Array");
		printArray(arr,0,n);
	}

	private static void printArray(int[] arr, int i,int n) {
		if(i>=arr.length)return;		
		System.out.println(arr[i]);
		printArray(arr, i+1,n-1);
		
	}

	private static void reverse(int[] arr, int start, int end) {
		
		if(start>=end)return;
		
		swap(arr,start,end);
		reverse(arr,start+1,end-1);
		
				
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}
}
