package academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio;

public class Smartphone {
    private String seriaNumber;
    private String marca;

    public Smartphone(String marca, String seriaNumber) {
        this.marca = marca;
        this.seriaNumber = seriaNumber;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
