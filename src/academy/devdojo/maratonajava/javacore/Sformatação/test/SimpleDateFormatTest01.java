package academy.devdojo.maratonajava.javacore.Sformatação.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println("teste");
    }
}
    