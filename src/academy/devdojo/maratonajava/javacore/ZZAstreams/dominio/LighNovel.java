package academy.devdojo.maratonajava.javacore.ZZAstreams.dominio;

import java.util.Objects;

public class LighNovel {
    private String nome;
    private double price;

    public LighNovel(String nome, double price) {
        this.nome = nome;
        this.price = price;
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
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }
}
