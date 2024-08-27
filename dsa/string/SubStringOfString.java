package com.dsa.string;

public class SubStringOfString {

	public static void main(String[] args) {
		
		String str="flower";
		String sub="flowr";
		
		if(isSubstring(str,sub)) {
			System.out.println("Yes, substring of String available!");
		}else {
			System.out.println("No substring is not available!");
		}
	}

	private static boolean isSubstring(String str, String sub) {
		
		return str.indexOf(sub)!=-1;
		
	}
}
