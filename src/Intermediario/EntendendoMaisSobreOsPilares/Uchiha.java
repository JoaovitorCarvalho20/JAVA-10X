package Intermediario.EntendendoMaisSobreOsPilares;

public class Uchiha extends Ninja implements ScharinganAtivado{

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
    //TODO: Gerar os novos construtores construtores
    public Uchiha(String nome, String aldeia, int idade, Rank rank, int numeroDemissoes) {
        super(nome, aldeia, idade, rank, numeroDemissoes);
    }




    @Override
    public void ScharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }
}
