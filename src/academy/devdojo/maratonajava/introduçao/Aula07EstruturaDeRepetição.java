package academy.devdojo.maratonajava.introduçao;

public class Aula07EstruturaDeRepetição {
    public static void main(String[] args) {
        double valorTotal = 50000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela + " Sem Juros!");
            } else {
                break;
            }
            System.out.println("fora do if" + parcela);
        }
    }
}
