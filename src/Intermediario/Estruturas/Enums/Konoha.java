package Intermediario.Estruturas.Enums;

public class Konoha {
    public static void main(String[] args) {


        //obj 2
        Missoes missoes1 = new Missoes( RankDeMissoes.A,"Salvar Vila");
        System.out.println(missoes1.getRank());
        System.out.println(missoes1.getNomeMissao());

        //obj 2
        Missoes missoes2 = new Missoes( RankDeMissoes.S,"Salvar Naruto");
        System.out.println(missoes2);
    }
}
