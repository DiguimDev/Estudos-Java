package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados");

    }
    @Override
    public void remove() {
        System.out.println("Removendo o Banco de Dados");
    }
}
