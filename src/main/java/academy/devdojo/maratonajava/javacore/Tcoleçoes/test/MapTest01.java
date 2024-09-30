package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        //Map nao pode ter Chaves duplicadas
        Map<String,String> map = new HashMap<>(); // LinkedHashMap mantém a Ordem digitada
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc","você"); // no map ele sobrescreve caso tenha a mesma chave;
        System.out.println(map);
        for(String chave : map.keySet()){
            System.out.println(chave + " : " + map.get(chave));
        }
        System.out.println("-------------------------");
        for(String valor : map.values()){
            System.out.println(valor);
        }
        System.out.println("------------");
        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
