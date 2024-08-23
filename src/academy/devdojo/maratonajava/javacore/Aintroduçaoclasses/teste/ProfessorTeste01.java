package academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
