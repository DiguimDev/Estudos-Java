package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStrig(10000);
        long fim = System.currentTimeMillis();
        System.out.println("O tempo gasto foi de " + (fim - inicio));

        inicio = System.currentTimeMillis();
        concatStrigBuilder(10000);
        fim = System.currentTimeMillis();
        System.out.println("O tempo gasto foi de " + (fim - inicio));
    }
    private static void concatStrig(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    private static void concatStrigBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
