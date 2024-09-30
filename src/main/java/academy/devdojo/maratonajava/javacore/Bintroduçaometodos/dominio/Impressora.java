package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Impressora {
    public void imprimir(Funcionarios funcionarios){
        System.out.println("------------------");
        System.out.println(funcionarios.getNome());
        System.out.println(funcionarios.getIdade());
            if(funcionarios.getSalario() == null){
                return;
            }
        for (double num: funcionarios.getSalario()) {
           System.out.println(num);

       }
        mediaSalario(funcionarios);
    }
    public void mediaSalario(Funcionarios funcionarios){
        if (funcionarios.getSalario() == null){
            return;
        }

        double nume = 0;
        for (double num : funcionarios.getSalario()){
            nume += num;
        }
        double result = nume /funcionarios.getSalario().length;
        System.out.println("---------------------");
        System.out.println("A media dos "+ funcionarios.getSalario().length + " salarios é: " + result);
    }

}
