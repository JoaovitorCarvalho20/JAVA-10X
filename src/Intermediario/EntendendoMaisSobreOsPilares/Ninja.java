package Intermediario.EntendendoMaisSobreOsPilares;

public class Ninja implements AtributosNinja{

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

    // Implementação dos metodos sobrecarregados

    @Override
    public void inteligenciaDeBatalha() {
        System.out.println("Meu nome é " + nome + " e essa é minha INTELIGENCIA DE BATALHA");
    }

    @Override
    public void inteligenciaDeBatalha(int qi) {
        if (qi > 150){
            System.out.println("Voce é um ninja genio");
        } else if (qi >= 130) {
            System.out.println("Voce é um ninja promissor");
        }else {
            System.out.println("Voce precisa treinar mais");
        }
    }
}
