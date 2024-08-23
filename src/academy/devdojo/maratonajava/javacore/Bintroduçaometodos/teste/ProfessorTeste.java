package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Jiraya";
        professor.idade = 57;
        professor.sexo = 'M';

        professor.imprimir();
    }
}
