package academy.devdojo.maratonajava.javacore.ZZDcrud.service;

import academy.devdojo.maratonajava.javacore.ZZDcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZDcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                delete();
                break;
            case 3:
                save();
                break;
            default:
                throw new IllegalArgumentException("Not valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("ID: [%d] - %s\n", p.getId(), p.getName()));
    }

    private static void delete(){
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure ? Y/N");
        String choice = SCANNER.nextLine();
        if("y".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
    }
    private static void save(){

        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}
