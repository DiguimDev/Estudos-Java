package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor teacher = new Professor("Jiraya");
        Professor teacher2 = new Professor("Kakashi");

        Professor[] teachers = {teacher, teacher2};
        Escola escola = new Escola("Dom Fernando", teachers);
        escola.imprime();

    }
}
