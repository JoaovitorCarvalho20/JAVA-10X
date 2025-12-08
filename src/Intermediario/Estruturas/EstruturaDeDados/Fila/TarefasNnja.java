package Intermediario.Estruturas.EstruturaDeDados.Fila;

public class TarefasNnja {
    private String nome;
    private  char status;

    public TarefasNnja() {
    }

    public TarefasNnja(String nome, char status) {
        this.nome = nome;
        this.status = status;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TarefasNnja{" +
                "nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }
}
