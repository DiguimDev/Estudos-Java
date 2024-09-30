package academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.test;

import academy.devdojo.maratonajava.javacore.ZZBpadroesdeprojetos.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactor.newCurrency(country);
        Person person = new Person.PersonBuilder()
                .firstName("Thauan")
                .lastName("Rodrigues")
                .userName("Svelte")
                .email("gsiagis@gmail.com")
                .build();
        ReportDto build = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .withCountry(country)
                .withCurrency(currency)
                .withPersonName(person.getFirstName() + " " + person.getLastName())
                .build();

        System.out.println(build);
    }
}
