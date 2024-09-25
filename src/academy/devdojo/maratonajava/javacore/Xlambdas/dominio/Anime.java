package academy.devdojo.maratonajava.javacore.Xlambdas.dominio;

public class Anime {
    final private String title;
    final private Integer quantity;

    public Anime(String title, Integer quantity) {
        this.title = title;
        this.quantity = quantity;

    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
