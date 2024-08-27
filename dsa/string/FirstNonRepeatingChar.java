package com.dsa.string;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		
		String str="aabdc";
		
		char ch=findFirstNonRepeating(str);
		System.out.println(ch);
		
	}

	private static char findFirstNonRepeating(String str) {
		str=str.toLowerCase();
		
		int [] freq=new int[26];
		
		for(char c:str.toCharArray()) {
			freq[c-'a']++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(freq[str.charAt(i)-'a']==1) {
				return str.charAt(i);
			}
		}
		return 0;
	}

}
