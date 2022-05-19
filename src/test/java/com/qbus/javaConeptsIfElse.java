package com.qbus;

import java.util.ArrayList;

public class JavaConeptsIfElse {
    public static void main(String[] args) {
        
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10,888};

        for(int i=0; i<arr3.length; i++){
            if(arr3[i] %2 == 0){
                System.out.println(arr3[i]);
            }
            else{
                 System.out.println(arr3[i]+" vse propalo");
            
            }

        }
        //array list

        ArrayList<String> a = new ArrayList<String>();
        a.add("qbus");
        a.add("aa");
        a.add("third");
        System.out.println(a.get(0));

   
   
    }
    
}
