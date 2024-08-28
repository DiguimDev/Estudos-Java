package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociação.dominio.Time;

public class Jogadortest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Robinho");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        Time time = new Time(jogadores, "Santos");

        time.imprime();

    }
}
