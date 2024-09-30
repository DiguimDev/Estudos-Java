package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Thauan";
        nome.concat(" Rodrigues");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder(16);
        sb.append("Thauan Rodrigues");
        System.out.println(sb);
        sb.append(" Boladão");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
