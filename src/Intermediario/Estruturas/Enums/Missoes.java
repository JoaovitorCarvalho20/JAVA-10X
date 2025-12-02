package Intermediario.Estruturas.Enums;

public class Missoes {

    private RankDeMissoes rank;
    private String nomeMissao;

    public Missoes(RankDeMissoes rank, String nomeMissao) {
        this.rank = rank;
        this.nomeMissao = nomeMissao;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    @Override
    public String toString() {
        return "Missoes{" +
                "rank=" + rank +
                ", nomeMissao='" + nomeMissao + '\'' +
                '}';
    }
}
