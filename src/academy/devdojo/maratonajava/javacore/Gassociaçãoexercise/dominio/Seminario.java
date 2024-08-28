package academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo,Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos,Local local) {
        this(titulo, local);
        this.alunos = alunos;
    }
    public void imprime(){
        System.out.println("_____________________");
        System.out.println(this.titulo);
        System.out.println(this.local.getEndereço());
        if(alunos == null) return;
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
