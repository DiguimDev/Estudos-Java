package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Impressora {
    public void imprimir(Funcionarios funcionarios){
        System.out.println("------------------");
        System.out.println(funcionarios.nome);
        System.out.println(funcionarios.idade);
            if(funcionarios.salario == null){
                return;
            }
        for (double num: funcionarios.salario) {
           System.out.println(num);

       }
        mediaSalario(funcionarios);
    }
    public void mediaSalario(Funcionarios funcionarios){
        if (funcionarios.salario == null){
            return;
        }

        double nume = 0;
        for (double num : funcionarios.salario){
            nume += num;
        }
        double result = nume /funcionarios.salario.length;
        System.out.println("---------------------");
        System.out.println("A media dos "+ funcionarios.salario.length + " salarios é: " + result);
    }
}
