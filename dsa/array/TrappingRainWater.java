package com.dsa.array;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Water trapped: " +trap(height));
    }

    private static int trap(int[] height) {

        int n=height.length;
        if(n==0)return 0;

        int [] leftMax=new int[n];
        int [] rightMax=new int[n];

        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--) {
           rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        int water=0;
        for(int i=0;i<n;i++){
            water+=Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return water;

    }
}
