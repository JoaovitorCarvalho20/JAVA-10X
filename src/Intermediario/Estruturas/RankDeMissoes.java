package Intermediario.Estruturas;

public enum RankDeMissoes {
    A("Dificil", 7),
    B("Media", 5),
    C("moderada", 4),
    D("Facil",2),
    S("Hard",10);

    private String descriçao;
    private int dificuldade;


    RankDeMissoes(String descriçao, int dificuldade) {
        this.descriçao = descriçao;
        this.dificuldade = dificuldade;
    }


    @Override
    public String toString() {
        return "RankDeMissoes{" +
                "descriçao='" + descriçao + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }
}
