package academy.devdojo.maratonajava.javacore.Sformatação.test;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT");
        Locale localeFrance = new Locale("fr","FR");
        Locale localeBrazil = new Locale("pt","BR");
        Calendar calendar = Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat dateInstance1 = DateFormat.getDateInstance(DateFormat.FULL, localeFrance);
        DateFormat dateInstance2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        System.out.println("Italia " + dateInstance.format(calendar.getTime()));
        System.out.println("França " + dateInstance1.format(calendar.getTime()));
        System.out.println("Brazil " + dateInstance2.format(calendar.getTime()));

    }
}
