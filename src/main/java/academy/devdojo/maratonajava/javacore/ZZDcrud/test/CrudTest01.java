package academy.devdojo.maratonajava.javacore.ZZDcrud.test;

import academy.devdojo.maratonajava.javacore.ZZDcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true){
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if(op == 0) break;
            ProducerService.buildMenu(op);
        }
    }
    private static void producerMenu(){
        System.out.println("Type Number of Operation");
        System.out.println("1. Search for producer");
        System.out.println("0. Exit");
    }
}
