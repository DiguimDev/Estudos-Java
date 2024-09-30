package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        this.salario = this.salario + this.salario * 0.1;
    }
}
