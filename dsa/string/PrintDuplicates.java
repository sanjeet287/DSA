package com.dsa.string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {

	public static void main(String[] args) {

		String str = "aaabcbcbd";

		findDuplicates(str);
	}

	private static void findDuplicates(String str) {

		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {

			if (countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c) + 1);
			} else {
				countMap.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> map : countMap.entrySet()) {

			if (map.getValue() > 1) {
				System.out.println(map.getKey() + " ,count= " + map.getValue());
			}
		}
	}
}
