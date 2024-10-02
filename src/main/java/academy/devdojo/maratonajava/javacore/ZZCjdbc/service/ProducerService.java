package academy.devdojo.maratonajava.javacore.ZZCjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZCjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZCjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }
    public static void delete(int id){
        invalidException(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer){
        invalidException(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }
    public static List<Producer> findByName(String name){
        return ProducerRepository.findByName(name);
    }
    public static void showProducerMetaData(){
         ProducerRepository.showProducerMetaData();
    }
    public static void showDriverMetaData(){
        ProducerRepository.showDriverMetaData();
    }
    public static void showTypeScrollWorking(){
        ProducerRepository.showTypeScrollWorking();
    }
    public static void invalidException(int id){
        if (id <= 0){
            throw new IllegalArgumentException("ID Inválido");
        }
    }
    public static List<Producer> findByNameAndUpdateToUppercase(String name){
        return ProducerRepository.findByNameAndUpdateToUppercase(name);
    }

}
