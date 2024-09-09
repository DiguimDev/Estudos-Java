package academy.devdojo.maratonajava.javacore.Sformatação.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt","BR");
        Locale localeIt = Locale.ITALY;
        Locale localeJapan = Locale.JAPAN;
        Locale localeEua = Locale.US;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJapan);
        nfa[2] = NumberFormat.getCurrencyInstance(localeIt);
        nfa[3] = NumberFormat.getCurrencyInstance(localeEua);

        double valor = 10000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        
    }
}
