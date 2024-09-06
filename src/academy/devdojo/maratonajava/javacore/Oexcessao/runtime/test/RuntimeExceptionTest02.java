package academy.devdojo.maratonajava.javacore.Oexcessao.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b Não Pode Ser Zero
     * @return
     * @throws IllegalArgumentException Case B = 0;
     */
    private static int divisao(int a , int b) throws IllegalArgumentException{
        if(b == 0){
            throw new RuntimeException("Argumento Ilegal, Não pode ser 0");
        }
            return a/b;
    }
}
