package Intermediario.EntendendoMaisSobreOsPilares;

public class Ninja {

    //TODO : Adicionar o atributos numeroDemissoes e rank
    public String nome;
    public String aldeia;
    public int idade;
    public Rank rank;
    public int numeroDemissoes;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO : Sobrecarregar o metodo construtor
    public Ninja(String nome, String aldeia, int idade,Rank rank, int numeroDemissoes ){
        this(nome, aldeia, idade);
        this.rank= rank;
        this.numeroDemissoes=numeroDemissoes;
    }

    public void mostrarInf(){
        System.out.println("O nome é " + nome);
        System.out.println("A aldeia é "+ aldeia);
        System.out.println("A idade é "+ idade);
        System.out.println("O meu rank é " + rank);
        System.out.println("O meu numero de missoes é " + numeroDemissoes);
    }
}
