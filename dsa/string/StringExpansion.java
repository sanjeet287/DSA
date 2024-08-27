package com.dsa.string;

public class StringExpansion {

    public static void main(String[] args) {

        String str="a3b4c2d1";
        expandString(str);
    }

    private static void expandString(String str) {

        if(str.length()==0||str==null){
            return;
        }

        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);

            if(Character.isAlphabetic(ch)){
                System.out.print(ch+"");
            }else{

                int x=Character.getNumericValue(ch);
                for (int j = 0; j < x; j++) {
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
