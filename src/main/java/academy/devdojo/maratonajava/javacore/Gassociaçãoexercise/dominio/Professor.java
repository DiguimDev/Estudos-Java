package academy.devdojo.maratonajava.javacore.Gassociaçãoexercise.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade,Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }
    public void imprime(){
        System.out.println("_______________________");
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        System.out.println("________Seminarios do Professor________");
        for (Seminario seminario : seminarios) {
            System.out.println("______ Cursos e Locais ______");
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereço());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
