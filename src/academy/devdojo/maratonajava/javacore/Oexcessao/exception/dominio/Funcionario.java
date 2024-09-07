package academy.devdojo.maratonajava.javacore.Oexcessao.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() {
        System.out.println("Salvando funcionario");
    }
}
