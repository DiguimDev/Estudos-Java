package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Funcionarios;
import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Impressora;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        Impressora impressora = new Impressora();

        funcionarios.setNome("Robervaldo");
        funcionarios.setIdade(27);
        funcionarios.setSalario(new double[]{1234.78, 2000, 1500.12, 1200});

        impressora.imprimir(funcionarios);


    }
}
