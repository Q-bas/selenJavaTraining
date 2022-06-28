package javaCore;

public class ChildKeywordDemo extends ParentKeywordDemo {
    
    String name = "not Qbus";
    public void getString() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        ChildKeywordDemo ckd = new ChildKeywordDemo();
        ckd.getString(); 
    }
}
