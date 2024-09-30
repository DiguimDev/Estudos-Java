package academy.devdojo.maratonajava.javacore.Mintefaces.teste;

import academy.devdojo.maratonajava.javacore.Mintefaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Mintefaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Mintefaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.permissionCheck();
        fileLoader.permissionCheck();

        DataLoader.checkingDataLoader();
    }
}
