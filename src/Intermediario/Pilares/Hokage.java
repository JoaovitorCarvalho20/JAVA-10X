package Intermediario.Pilares;

public class Hokage {
    // construtores

    public String nome;
    public int idade;
    public boolean vivoOuMorto;


    public Hokage(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    @Override
    public String toString() {
        return "Hokage{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", vivoOuMorto=" + vivoOuMorto +
                '}';
    }
}
