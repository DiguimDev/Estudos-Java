package academy.devdojo.maratonajava.javacore.Gassociação.dominio;

public class Escola {
    private String nome;
    private Professor[] teachers;


    public void imprime() {
        System.out.println(this.nome);
        if (teachers != null) {
            for (Professor teacher : teachers) {
                System.out.println(teacher.getNome());
            }
        }

    }

    public Escola(String nome, Professor[] teachers) {
        this.nome = nome;
        this.teachers = teachers;
    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return teachers;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
