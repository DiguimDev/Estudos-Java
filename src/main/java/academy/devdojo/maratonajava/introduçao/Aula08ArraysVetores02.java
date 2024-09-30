package academy.devdojo.maratonajava.introduçao;

public class Aula08ArraysVetores02 {
    public static void main(String[] args) {
        // byte, shote, long , int , double e float 0
        //char \u0000
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Kuririn";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
