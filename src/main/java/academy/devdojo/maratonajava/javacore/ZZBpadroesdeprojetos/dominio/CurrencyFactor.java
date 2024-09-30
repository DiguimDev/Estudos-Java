package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio;

public class CurrencyFactor {
public static Currency newCurrency(Country country){
    switch (country){
        case BRAZIL -> {
            return new Real();
        }
        case USA ->
        {
            return new UsDollar();
        }
        default -> throw new IllegalArgumentException("MOEDA NAO ENCONTRADA");
    }
}
}
