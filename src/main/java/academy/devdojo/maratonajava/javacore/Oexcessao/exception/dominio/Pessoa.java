package academy.devdojo.maratonajava.javacore.Oexcessao.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar()throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando Pessoa");
    }
}
