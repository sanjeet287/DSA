package com.dsa.array;

public class MovingZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void moveZeroes(int[] arr) {

        int nonZeroIdx=0;

        //shifted the non-zeros to left
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[nonZeroIdx++]=arr[i];
            }
        }

        //fill the vacant place with 0
        for(int i=nonZeroIdx;i<arr.length;i++){
            arr[i]=0;
        }
    }
}
