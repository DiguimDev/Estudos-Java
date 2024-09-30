package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Professor {
    private String nome;
    private int idade;
    private char sexo;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
}
