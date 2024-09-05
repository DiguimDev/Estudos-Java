package academy.devdojo.maratonajava.javacore.Oexcessao.error.teste;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    };
}
