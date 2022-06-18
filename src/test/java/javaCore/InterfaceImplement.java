package javaCore;

import interfaces.InterfaceStdy;

public class InterfaceImplement implements InterfaceStdy{ 
    //for additional interface class - add it after first one coma separated
    // dont'f forget to add object to call methods from it

    public static void main(String[] args) {
        //create object for InterfaceImplementto implement methods present in InterfaceStdy
        InterfaceStdy a = new InterfaceImplement();
        //call methods
        a.methodOne();
        a.methodTwo();
        a.methodThree();  
        // to call internal method - create object for it
        InterfaceImplement b = new InterfaceImplement();
        //than call it
        b.nonInterfaceOne();
        

    }
    // override - implemntation of interface method
    @Override
    public void methodOne() {
        System.out.println("methodOne implementation");
        
    }

    @Override
    public void methodTwo() {
        System.out.println("methodTwo implementation");
        
    }

    @Override
    public void methodThree() {
        System.out.println("methodThree implementation");
        
    }

    // thats internal method. not from interface
    public void nonInterfaceOne() {
        System.out.println("nonInterfaceOne");
    }
    
}
