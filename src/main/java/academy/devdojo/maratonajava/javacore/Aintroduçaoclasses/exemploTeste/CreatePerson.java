package academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.exemploTeste;

import academy.devdojo.maratonajava.javacore.Aintroduçaoclasses.exemploDominio.Person;

public class CreatePerson {
    public static void main(String[] args) {
        Person Knight = new Person();
        Knight.name = "Thauan";
        Knight.classe = "Strenght Knight";
        Knight.attackPower = 25;
        Knight.defensePower = 45;
        Knight.sexo = 'M';


        System.out.println(Knight.name);
        System.out.println(Knight.classe);
        System.out.println(Knight.attackPower);
        System.out.println(Knight.defensePower);
        System.out.println(Knight.sexo);
        System.out.println(Knight.life);

        for (int i = 0; i < Knight.life;) {

            if (Knight.life == 100) {
                System.out.println("------------------");
                System.out.println(Knight.life);
            }
            System.out.println("--------------------");
            Knight.life -= 20;
            System.out.println("Cavaleiro tomou 20 de dano e agora esta com " + Knight.life + " de vida");
        }
    }

}
