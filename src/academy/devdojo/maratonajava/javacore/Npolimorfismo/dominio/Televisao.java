package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_TELEVISAO = 0.30;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Tv");
        return this.valor * Televisao.IMPOSTO_TELEVISAO;
    }
}
