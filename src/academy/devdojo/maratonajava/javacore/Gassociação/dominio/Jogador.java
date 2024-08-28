package academy.devdojo.maratonajava.javacore.Gassociação.dominio;


public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(this.time.getNome());
        }
    }
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
