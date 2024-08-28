package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador1 = new Jogador("Mário");
        Time time = new Time("Seleção Brasileira");

        Jogador[] jogadores = {jogador, jogador1};

        jogador.setTime(time);
        jogador1.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---- jogador -----");
        jogador.imprime();
        System.out.println("---------time ----------");
        time.imprime();
    }
}
