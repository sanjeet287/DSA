package com.dsa.string;

import java.util.HashMap;

public class StringCompression {

    public static void main(String[] args) {

        String str="aaabbccccd";
        HashMap<Character,Integer> charMap=compressString(str);
        for(Character ch:charMap.keySet()) {
            System.out.print(ch+""+charMap.get(ch));
        }
    }

    private static HashMap<Character,Integer> compressString(String str) {
        HashMap<Character,Integer> charMap=new HashMap<>();

        for(char ch:str.toCharArray()){
            if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.getOrDefault(ch,0)+1);
            }else{
                charMap.put(ch,0);
            }
        }
        return charMap;
    }
}
