package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Funcionarios;
import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Impressora;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        Impressora impressora = new Impressora();

        funcionarios.nome = "Robervaldo";
        funcionarios.idade = 37;
        funcionarios.salario = new double[]{1234.2,1245.1,1456.2,1213.7 };

        impressora.imprimir(funcionarios);


    }
}
