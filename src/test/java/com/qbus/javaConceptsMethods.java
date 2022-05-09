package com.qbus;

public class javaConceptsMethods {
    public static void main(String[] args) {
        javaConceptsMethods smthing = new javaConceptsMethods();
        String variable = smthing.getData();
        System.out.println(variable);



        javaConceptMethod2 foo = new javaConceptMethod2();
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
