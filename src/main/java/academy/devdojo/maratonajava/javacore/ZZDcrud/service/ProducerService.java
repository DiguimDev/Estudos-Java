package academy.devdojo.maratonajava.javacore.ZZDcrud.service;

import academy.devdojo.maratonajava.javacore.ZZDcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZDcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
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
            case 4:
                update();
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

    private static void delete() {
        System.out.println("Type one of the ids below to delete");
        findByName();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure ? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {

        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producer = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producer.isEmpty()) {
            System.out.println("Producer Not Found");
            return;
        }
        Producer producerFromDb = producer.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;
        Producer producer1 = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();
        ProducerRepository.update(producer1);
    }

}
