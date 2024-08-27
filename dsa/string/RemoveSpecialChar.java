package com.dsa.string;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String str = "cloud@##123I13ndi@a";

		String result = removeSpecialChar(str);

		System.out.println(result);

	}

	private static String removeSpecialChar(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// if(ch>=64 && ch<=122)
			if (Character.isLetter(ch)) {
				result += ch;
			}
		}

		return result;
	}
}
