package javaCore;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTttrl {
    public static void main(String[] args) {
        //get instanceof calendar
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/d/yyyy");
        //format date for Calendar output
        System.out.println( sdf.format(cal.getTime()));
        //get todays date
        cal.get(Calendar.DAY_OF_MONTH);
    }
}
