package javaCore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //invoke date javaclass object
        Date date = new Date();
        
        //print current date | date is object so convert it to string
        System.out.println(date.toString());

        // object that set date format
        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
        //print date in defined format
        System.out.println(sdf.format(date));
        //add another date format
        SimpleDateFormat sdf2= new SimpleDateFormat("yyyy/d/MM HH:mm:ss");
        //print date in second format
        System.out.println(sdf2.format(date));
    }
}
