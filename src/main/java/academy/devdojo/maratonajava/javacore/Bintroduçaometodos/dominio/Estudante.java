package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
