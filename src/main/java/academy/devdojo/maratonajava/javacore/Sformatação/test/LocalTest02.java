package academy.devdojo.maratonajava.javacore.Sformatação.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+ " ");
        }
        System.out.println("\n------------------------------------");
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+ " ");
        }


    }
}
