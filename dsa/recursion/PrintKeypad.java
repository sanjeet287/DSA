package com.dsa.recursion;

public class PrintKeypad {

    private static final String[] KEYPAD_MAPPING={"","","abc","def","ghi","jkl","mno","pqrs","uvw","xyz"};

    public static void main(String[] args) {

        int input=234;
        printKeypad(input,"");
    }

    private static void printKeypad(int input, String result) {

        if(input==0){
            System.out.println(result);
            return;
        }

        int lastDigit=input%10;

        String str=KEYPAD_MAPPING[lastDigit];

        for(int i=0;i<str.length();i++) {

            printKeypad(input / 10,str.charAt(i)+result );
        }


    }
}
