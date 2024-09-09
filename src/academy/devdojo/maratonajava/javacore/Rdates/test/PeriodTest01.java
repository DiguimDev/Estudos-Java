package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDateAfterTwoYears = LocalDate.now().plusYears(2).plusDays(8);

        Period p1 = Period.between(localDate,localDateAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(54);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }


}
