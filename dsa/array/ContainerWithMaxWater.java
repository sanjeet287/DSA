package com.dsa.array;

public class ContainerWithMaxWater {

    public static void main(String[] args) {

        int [] height = { 3, 1, 2, 4, 5 };

        System.out.println("Water trapped: "+trap(height));

    }

    private static int trap(int[] height) {

        int left=0,right=height.length-1,maxArea=Integer.MIN_VALUE;

        while(left<right){

            int area=Math.min(height[left],height[right])*(right-left);

            maxArea=Math.max(area,maxArea);

            left++;
            right--;
        }

        return maxArea;
    }
}
