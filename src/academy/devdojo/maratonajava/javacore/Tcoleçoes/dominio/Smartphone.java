package academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio;

public class Smartphone {
    private String seriaNumber;
    private String marca;

    public Smartphone(String marca, String seriaNumber) {
        this.marca = marca;
        this.seriaNumber = seriaNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return seriaNumber != null && seriaNumber.equals(smartphone.seriaNumber);
    }

    @Override
    public int hashCode() {
        return seriaNumber == null ? 0 : this.seriaNumber.hashCode();
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
