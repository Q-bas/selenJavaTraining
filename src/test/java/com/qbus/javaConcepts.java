package com.qbus;

public class JavaConcepts {
    public static void main(String[] args) {
        
        // Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1]= 2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;

        int[] arr2 = {6,7,8,9,10};

        String[] name = {"qbus","aa","vv"};

        //for loop
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // another for loop
        for(String s:name){
            System.out.println(s);
        }
        for(int n:arr2){
            System.out.println(n);
        }
    }
    
}
