package academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.teste;

import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio.Seminario;

public class SistemaSeminario01 {
    public static void main(String[] args) {
        Local local = new Local("Aldeia da Folha");
        Seminario seminario = new Seminario("Ninjas",local);
        Seminario seminario2 = new Seminario("Samurai",local);
        Seminario[] seminarios = {seminario, seminario2};
        Aluno aluno1 = new Aluno(18,"Thauan",seminario);
        Aluno aluno2 = new Aluno(18,"Joao",seminario);
        Aluno aluno3 = new Aluno(18,"tna",seminario);

        Professor professor = new Professor("Kakashi","Ninjutsu",seminarios);
        seminario.setAlunos(new Aluno[]{aluno1,aluno2,aluno3});



        aluno1.imprime();
        seminario.imprime();
        professor.imprime();
    }
}
