package academy.devdojo.maratonajava.javacore.Mintefaces.dominio;

public interface DataLoader {
    void load();
    default void permissionCheck(){
        System.out.println("Checando permissão");
    }
    static void checkingDataLoader(){
        System.out.println("dentro do interface Dataloader");
    }
}
