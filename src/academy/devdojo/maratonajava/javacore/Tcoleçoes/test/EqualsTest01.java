package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ec4","Iphone");
        Smartphone s2 = new Smartphone("1ec4","Iphone");
        System.out.println(s1.equals(s2));
    }
}
