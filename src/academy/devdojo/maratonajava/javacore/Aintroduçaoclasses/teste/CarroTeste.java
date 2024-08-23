package academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro Carro1 = new Carro();
        Carro Carro2 = new Carro();

        Carro1.nome = "Fiat";
        Carro1.modelo = "Uno com Escada";
        Carro1.ano = 1997;

        Carro2.nome = "Chevrolet";
        Carro2.modelo = "Camaro";
        Carro2.ano = 2006;

        System.out.println(Carro1.nome + " " + Carro1.modelo + " " + Carro1.ano);
        System.out.println("------------------------------------------------");
        System.out.println(Carro2.nome + " " + Carro2.modelo + " " + Carro2.ano);

    }
}
