package academy.devdojo.maratonajava.javacore.Oexcessao.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
    criarNovoArquivo();
    }
    private static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo/teste.txt");
        try{
            boolean criado = file.createNewFile();
            System.out.println("Arquivo criado "+ criado);
            if(criado == false){
                throw new RuntimeException("Arquivo Ja Existe");
            }
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}
