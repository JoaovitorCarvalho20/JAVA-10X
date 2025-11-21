package Desafios.Desafio04;

public class NinjaBasico  implements Ninja{

    public String nome;
    public int idade;
    public String habilidade;

    public NinjaBasico (String nome , int idade, String habilidade){
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
    public NinjaBasico(){}

    @Override
    public void mostrarInformacoes() {
        System.out.println("O nome é " + nome );
        System.out.println("A idade é " + idade);
        System.out.println("A habilidade é "+ habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando a habilidade " + habilidade );
    }
}
