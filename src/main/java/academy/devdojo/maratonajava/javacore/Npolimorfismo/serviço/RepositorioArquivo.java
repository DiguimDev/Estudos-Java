package academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.printf("Salvando Arquivos");
    }
}
