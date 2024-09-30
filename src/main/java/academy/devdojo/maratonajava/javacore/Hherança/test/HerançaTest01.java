package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Endereço;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class HerançaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 3");
        endereço.setCep("40028922-12");
        Pessoa pessoa = new Pessoa("Jesus");
        pessoa.setCpf("898989889");
        pessoa.setEndereço(endereço);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda");
        funcionario.setCpf("121212");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(1413.12);
        System.out.println("----------------");
        funcionario.imprime();
    }
}
