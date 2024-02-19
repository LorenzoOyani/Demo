package Exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: java calendar example");
            System.exit(1);
        }
        Calendar calender = new GregorianCalendar(Integer.valueOf(args[1]), Integer.valueOf(args[0]) - 1, 1);

        for (int i = 1; i < calender.get(Calendar.DAY_OF_WEEK); i++) {
            System.out.println(" ");
        }
        printHead(calender);
        while (calender.get(Calendar.DATE) < calender.getActualMaximum(Calendar.DATE)) {
            if (calender.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.printf("%4d", calender.get(Calendar.DAY_OF_WEEK));
            } else {
                System.out.printf("%4d", calender.get(Calendar.DAY_OF_WEEK));
            }

            calender.add(Calendar.DAY_OF_MONTH, 1);

        }
        System.out.printf("%4d\n", calender.get(Calendar.DAY_OF_MONTH));

    }
    public static String[] getMonth(){
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months;
    }

    public static void printHead(Calendar calender){
        String[] months = getMonth();

        // centre month and year
        int length  = 29 / 2 - (months[calender.get(Calendar.DAY_OF_MONTH) -1].length() / 2 + 3);

        for(int i = 0; i < length; i++){
            System.out.printf(" ");
            System.out.println(calender.get(Calendar.DAY_OF_MONTH) + ", " + calender.get(Calendar.YEAR));
        }
        System.out.println("---------------------");
        System.out.println("Mon, Tue, Wed, Thur, Fri, Sat, Sun");
    }

}