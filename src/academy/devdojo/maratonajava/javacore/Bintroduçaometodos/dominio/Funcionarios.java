package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salario;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(double[] salario){
        this.salario = salario;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double[] getSalario(){
        return this.salario;
    }
}