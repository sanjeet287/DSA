package com.dsa.string;

import java.util.HashMap;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        if(isAnagram(str1,str2)){
            System.out.println("Strings are Anagram");
        }else {
            System.out.println("Strings are not Anagram");
        }
    }

    private static boolean isAnagram(String str1, String str2) {

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch: str1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch:str2.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        //check the frequency of char of both string ==0,then anagram
        for(int count:map.values()){
            if(count!=0){
                return false;
            }

        }
        return true;
    }
}
