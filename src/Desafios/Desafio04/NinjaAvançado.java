package Desafios.Desafio04;

public class NinjaAvançado extends NinjaBasico implements Ninja {

    public String especialidade ;

    public NinjaAvançado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("O nome é " + nome );
        System.out.println("A idade é " + idade);
        System.out.println("A habilidade é "+ habilidade);
        System.out.println("A especialidade é " + especialidade);
    }

    @Override
    public void executarHabilidade() {

    }
}
