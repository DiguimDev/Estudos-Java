package academy.devdojo.maratonajava.javacore.ZZCjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepository;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(int id){
        if (id <= 0){
            throw new IllegalArgumentException("Invalid ID");
        }
        ProducerRepository.delete(id);
    }
    public static void update(String name, int id){
        if(id <= 0){
            throw new IllegalArgumentException("Invalid ID");
        }
        ProducerRepository.update(name, id);
    }
}
