package com.dsa.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="laptop";
		
		reverse(str);
	}

	private static void reverse(String str) {
		
		//iterative
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i)+"");
		}
		
	}

}
