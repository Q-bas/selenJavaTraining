package com.qbus;

public class JavaConceptsMethods {
    public static void main(String[] args) {
        JavaConceptsMethods smthing = new JavaConceptsMethods();
        String variable = smthing.getData();
        System.out.println(variable);



        JavaConceptMethod2 foo = new JavaConceptMethod2();
        foo.getUserData();

        getData2();

    }
    public String getData(){
        System.out.println("Hello world");
        return "qbus";
    }
    public static String getData2(){
        System.out.println("Hello world 2");
        return "qbus2";
    }
}
