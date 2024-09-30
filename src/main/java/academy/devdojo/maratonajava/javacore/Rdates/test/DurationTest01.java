package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Local;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime time = LocalTime.now();
        LocalTime timeMinus5Hours = LocalTime.now().minusHours(5);
        Duration d1 = Duration.between(localDateTime, localDateTimeAfterTwoYears);
        Duration d2 = Duration.between(time,timeMinus5Hours);
        System.out.println(d1);
        System.out.println(d2);
    }
}
