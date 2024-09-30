package academy.devdojo.maratonajava.javacore.Oexcessao.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcessao.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexcessao.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        funcionario.salvar();
    }
}
