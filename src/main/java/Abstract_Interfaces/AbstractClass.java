package Abstract_Interfaces;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The Number class is a prime example of a superclass having Abstract methods that can be implemented
 * in a subclass.
 * Number is a superclass of all the int, long, double, byte, short values.
 * Also, a superclass for wrapper classes like BigDecimal, BigInteger. etc.
 * */

public class AbstractClass {

    void main() {
        Calendar calendar = new GregorianCalendar();
        System.out.println("current time is "+ new Date());
        System.out.println("current year is "+ calendar.get(Calendar.YEAR));
        System.out.println("current year is "+ calendar.get(Calendar.YEAR));
        System.out.println("Month "+ calendar.get(Calendar.MONTH));
        System.out.println("Hour "+ calendar.get(Calendar.HOUR));
        System.out.println("HOUR 0F DAY "+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute "+ calendar.get(Calendar.MINUTE));
        System.out.println("Hour "+ calendar.get(Calendar.SECOND));
        System.out.println("Hour "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hour "+ calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour "+ calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Hour "+ calendar.get(Calendar.WEEK_OF_YEAR));

        
        Calendar calender1 = new GregorianCalendar(1995, Calendar.DECEMBER, 25);

         calender1.add(Calendar.ERA, -6);
         System.out.println();
         calender1.setTime(new Date());
         calender1.getTime();
        String[] det =  {"sunday".toUpperCase(), "monday".toUpperCase(), "tuesday".toUpperCase(), "wednesday".toUpperCase(), "thursday".toUpperCase(), "Friday".toUpperCase(), "saturday".toUpperCase(), "sunday".toUpperCase()};

//        String string = det[calender1.get(Calendar.DAY_OF_MONTH)];
        System.out.println(STR."The day of the MONTH of december 1995 is \{det[calender1.get(Calendar.DAY_OF_MONTH - 1)]}");

    }
}