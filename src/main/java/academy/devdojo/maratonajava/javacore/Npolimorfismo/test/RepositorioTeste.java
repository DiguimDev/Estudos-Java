package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio  repositorio = new RepositorioMemoria();
        repositorio.salvar();
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        System.out.println("\n------------------");
        repositorio1.salvar();
        Repositorio repositorio2 = new RepositorioArquivo();
        System.out.println("---------------------");
        repositorio2.salvar();
    }
}
