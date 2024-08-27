package com.dsa.string;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str="madam";
		
		if(isPalindrome(str)) {
			System.out.println("String is palindrome!");
		}else {
			System.out.println("String is not palindrome!");
		}
	}

	private static boolean isPalindrome(String str) {

		int left=0,right=str.length()-1;
		while(left<=right) {
			
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
