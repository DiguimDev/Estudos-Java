package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Jiraya");
        professor.setIdade(57);
        professor.setSexo('M');
        professor.imprimir();

        System.out.println(professor.getNome());
        System.out.println(professor.getIdade());
    }
}
