package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro Dia é domingao");
        }
        if (c.getFirstDayOfWeek() == Calendar.MONDAY) {
            System.out.println("Primeiro Dia é segundona");
        }
        System.out.println(c.get(c.DAY_OF_WEEK));
        System.out.println(c.get(c.DAY_OF_MONTH));
        System.out.println(c.get(c.DAY_OF_YEAR));
        System.out.println(c.get(c.DAY_OF_WEEK_IN_MONTH));

        c.add(c.DAY_OF_MONTH,5);
        c.add(c.MINUTE, 30);
        Date date = c.getTime();
        System.out.println(date);
    }
}
