package academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }


    public Aluno(int idade , String nome, Seminario seminario) {
        this(idade, nome);
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("______________________");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
