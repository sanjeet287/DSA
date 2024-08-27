package com.dsa.array;

public class SearchInRotate {
	
	public static void main(String[] args) {
		
		int [] arr= {4,5,6,7,1,2,3};
		int target=-7;
		
		int idx=Search(arr,target);
		if(idx!=-1) {
			System.out.println("Element Present at Index:"+idx);
		}else {
			System.out.println("Element Not Present in Array");
		}
	}

	private static int Search(int[] arr, int target) {
		
		//modified Binary Search
		int left=0, right=arr.length-1;
		
		
		while(left<=right) {
			
			int mid=left+(right-left)/2;
			
			if(arr[mid]==target) {
				return mid;
			}
			
			//left half is sorted
			
			if(arr[left]<=arr[mid]) {
				
				if(arr[left]<=target && target<arr[mid]) {
					right=mid-1;
				}else {
					left=mid+1;
				}
				
				//right half is sorted
			}else {
				if(arr[mid]<target && target<=arr[right]) {
					left=mid+1;;
				}else {
					right=mid-1;
				}
			}
		}
		return -1;
	}

}
