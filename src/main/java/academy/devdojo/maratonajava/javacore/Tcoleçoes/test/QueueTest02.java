package academy.devdojo.maratonajava.javacore.Tcoleçoes.test;

import academy.devdojo.maratonajava.javacore.Tcoleçoes.dominio.Consumidor;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
    Consumidor consumidor = new Consumidor("Thauan");
    Queue<Consumidor> consumidorQueue = new PriorityQueue<>();
    consumidorQueue.add(consumidor);
    }
}
