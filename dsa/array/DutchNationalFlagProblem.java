package com.dsa.array;

public class DutchNationalFlagProblem {

    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColors(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    private static void sortColors(int[] arr) {

        int left=0,mid=0,right=arr.length-1;

        while(mid<=right){

            switch (arr[mid]) {

                case 0:
                    swap(arr, left, mid);
                    mid++;
                    left++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,right);
                    mid++;
                    right--;
                    break;
            }
        }
    }

    private static void swap(int [] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
