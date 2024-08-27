package com.dsa.string;

public class ReverseWordInSentence {
	
	public static void main(String[] args) {
		
		String str="I am Frustrated";
		String result=reverseWords(str);
		if(!result.isEmpty()) {
			System.out.println(result);
		}
	}

	private static String reverseWords(String str) {
		
		String[] words=str.split("\\s+");
		String result="";
		for(int i=words.length-1;i>=0;i--) {
			result+=words[i];
			if(i!=0) {
				result+=" ";
			}
		}
		return result;
	}

}
