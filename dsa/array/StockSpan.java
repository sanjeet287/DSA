package com.dsa.array;

import java.util.Stack;

public class StockSpan {

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = calculateSpan(prices);


        for (int span : spans) {
            System.out.print(span + " ");
        }
    }

    private static int[] calculateSpan(int[] prices) {

        int n=prices.length;

        int[] span=new int[n];

        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<n;i++){

            //popping the element from stack if current price is greater than stack top index prices pos
            while (!stack.isEmpty() && prices[i]>=prices[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                span[i]=i-stack.peek();
            }

            //push current day price index onto stack
            stack.push(i);
        }

        return span;
    }
}
