package Intermediario.EntendendoMaisSobreOsPilares;

public class Hatake extends Ninja implements ScharinganAtivado, AmbuInterface {
    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
    //TODO: Gerar os novos construtores construtores

    public Hatake(String nome, String aldeia, int idade, Rank rank, int numeroDemissoes) {
        super(nome, aldeia, idade, rank, numeroDemissoes);
    }


    @Override
    public void ScharinganAtivado() {
        System.out.println(nome + " ativou o sharingan");
    }

    @Override
    public void MatarPessoa() {
        System.out.println("Foi mau, mas matei gente de mais pela ambu");
    }
}
