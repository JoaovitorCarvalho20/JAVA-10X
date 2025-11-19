package Intermediario.OOP;

public class Haruno extends Ninja{

    //Metodos de classe
    public void SocoForte(){
        System.out.println("Soco forte ativado");
    }

    @Override // Polimorfismo
    public void ataqueespecial() {
        System.out.println("Meu nome e " + nome + "e meu ataque especial e a VELOCIDADE");
    }
}
