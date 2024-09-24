package academy.devdojo.maratonajava.javacore.Xlambdas.dominio;

public class Anime {
    private String title;
    private int quantity;

    public Anime(String title, int quantity) {
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

    public int getQuantity() {
        return quantity;
    }
}
