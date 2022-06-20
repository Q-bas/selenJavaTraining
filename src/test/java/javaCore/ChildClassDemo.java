package javaCore;

public class ChildClassDemo extends ParentClassDemo{

    public static void main(String[] args) {
        ChildClassDemo cld = new ChildClassDemo();
        cld.nonAbstractMethodOne();
        cld.nonAbstractMethodTwo();
        cld.abstractMethod();
    }

    

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod");
        
    }
    
}
