package Intermediario.ClasseAbstrata;

public class Uzumaki extends Ninja {

    public Uzumaki(String nome, int idade) {
        this.nome=nome;
        this.idade=idade;
    }

    @Override
    public void clonesDaSombras() {
        System.out.println("Clone das sombras ativado");
    }

}
