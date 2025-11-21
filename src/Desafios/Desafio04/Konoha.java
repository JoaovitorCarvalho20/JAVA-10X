package Desafios.Desafio04;

public class Konoha {
    public static void main(String[] args) {

        //obj 1
        NinjaBasico n1 = new NinjaBasico("Naruto", 12, "Futon");
        n1.mostrarInformacoes();
        n1.executarHabilidade();


        // obj 2
        NinjaAvançado n2 = new NinjaAvançado("Sasuke", 12, "Fogo", "Velocidade");
        n2.mostrarInformacoes();
        n2.executarHabilidade();

    }
}
