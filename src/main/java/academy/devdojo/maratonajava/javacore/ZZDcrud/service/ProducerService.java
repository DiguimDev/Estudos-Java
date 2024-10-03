package academy.devdojo.maratonajava.javacore.ZZDcrud.service;

import academy.devdojo.maratonajava.javacore.ZZDcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZDcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            default:
                throw new IllegalArgumentException("Not valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s\n", producers.get(i).getId(), producers.get(i).getName());
        }
    }
}
