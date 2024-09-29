package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.CurrencyFactor;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactor.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
