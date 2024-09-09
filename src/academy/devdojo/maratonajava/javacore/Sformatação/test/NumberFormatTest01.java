package academy.devdojo.maratonajava.javacore.Sformatação.test;

import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Local;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt","BR");
        Locale localeIt = Locale.ITALY;
        Locale localeJapan = Locale.JAPAN;
        Locale localeEua = Locale.US;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJapan);
        nfa[2] = NumberFormat.getInstance(localeIt);
        nfa[3] = NumberFormat.getInstance(localeEua);

        double valor = 10000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "12136,99";

        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
