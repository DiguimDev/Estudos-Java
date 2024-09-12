package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Iphone", "1D245F");
        Smartphone s2 = new Smartphone("Pixel", "22222");
        Smartphone s3 = new Smartphone("Samsung", "33333");

        List<Smartphone> smartphoneList = new ArrayList<>(6);
        // limpar a lista utiliza o .clean 
        smartphoneList.add(s1);
        smartphoneList.add(s2);
        smartphoneList.add(s3);

        for (Smartphone smartphone: smartphoneList){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("Samsung", "33333");

        System.out.println(smartphoneList.contains(s4));

        int indexSmartphone4 = smartphoneList.indexOf(s4);
        System.out.println(indexSmartphone4);
    }
}
