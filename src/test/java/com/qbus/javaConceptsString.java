package com.qbus;

public class JavaConceptsString {
    public static void main(String[] args) {
        
        
        // String s = "qbus";
        // String s1 = "qbus";//s1 is same object as s - as long as text is the same

        // String s2 = new String("welcome");
        // String s3 = new String("welcome");//s3 is not the same object as s2

        String s4 = "qbus glory to ukraine";
        // String[] splittedString = s4.split(" ");
        // System.out.println(splittedString[0]);
        // System.out.println(splittedString[1]);
        // System.out.println(splittedString[2]);
        // System.out.println(splittedString[3]);

        for(int i = s4.length()-1;i>=0;i--){    //reverse
            System.out.println(s4.charAt(i));
        }
        for(int i =0;i<s4.length();i++){
            System.out.println(s4.charAt(i));
        }
    }
}
