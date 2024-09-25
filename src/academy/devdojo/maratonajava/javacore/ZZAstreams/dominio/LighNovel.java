package academy.devdojo.maratonajava.javacore.ZZAstreams.dominio;

public class LighNovel {
    private String nome;
    private double price;

    public LighNovel(String nome, double price) {
        this.nome = nome;
        this.price = price;
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
