package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        int hour, minute, second;
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        hour = localDateTime.getHour();
        minute = localDateTime.getMinute();
        second = localDateTime.getSecond();
        System.out.println("São: " + hour + ":" + minute + ":" + second);
    }
}
