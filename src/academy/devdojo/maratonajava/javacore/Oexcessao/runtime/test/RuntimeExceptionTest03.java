package academy.devdojo.maratonajava.javacore.Oexcessao.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            return "Conexão Aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando o Recurso");
        }
        return null;
    }
}
