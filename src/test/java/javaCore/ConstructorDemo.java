package javaCore;

public class ConstructorDemo {

    //constructor is only _public_
    //default constructor
    public ConstructorDemo(){
        //code to be executed when class object created
        System.out.println("This is the Constructor");
    }

    //another constructor type - Parametrized
    public ConstructorDemo(int a, int b){
        System.out.println("Constructor with parameters "+a+" "+b);
    }
    
    //just some method of the class
    public void someMethod(){
        System.out.println("This is the Method");
    }
    
    //just to see howit works. run and check console out
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
        cd.someMethod();
        
        ConstructorDemo cd2=new ConstructorDemo(100,200);
        cd2.someMethod();
    }
}
