package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioBandoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio  repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
