package academy.devdojo.maratonajava.javacore.Oexcessao.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
    criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo/teste.txt");
        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado "+ criado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
