package academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Thauan";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
