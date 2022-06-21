package javaCore;

public class MethodOverloading {
    
    public void getData(int a){
        System.out.println(a);
    }

    public void getData(String a) {
        System.out.println(a);
    }

    public void getData(int a, int b) {
        System.out.println(a+b); 
    }
    
    public static void main(String[] args) {
        
        MethodOverloading mo= new MethodOverloading();
        mo.getData(2);
        mo.getData("two");
        mo.getData(5,6);
    }

}
