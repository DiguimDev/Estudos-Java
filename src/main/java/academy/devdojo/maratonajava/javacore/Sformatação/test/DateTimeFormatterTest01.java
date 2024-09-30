package academy.devdojo.maratonajava.javacore.Sformatação.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String df1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String df2 = date.format(DateTimeFormatter.ISO_DATE);
        String df3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(df1);
        System.out.println(df2);
        System.out.println(df3);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatBr);
    }
}
