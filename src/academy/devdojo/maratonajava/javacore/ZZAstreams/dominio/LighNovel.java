package academy.devdojo.maratonajava.javacore.ZZAstreams.dominio;

import java.util.Objects;

public class LighNovel {
    private String nome;
    private double price;
    private Category category;

    public LighNovel(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public LighNovel(String nome, double price, Category category) {
        this.nome = nome;
        this.price = price;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LighNovel lighNovel = (LighNovel) o;
        return Objects.equals(nome, lighNovel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "LighNovel{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

}
