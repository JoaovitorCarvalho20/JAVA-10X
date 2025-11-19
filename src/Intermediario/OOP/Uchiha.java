package Intermediario.OOP;

public class Uchiha extends Ninja{
    //Metodos de classe
    public void sharingan (){
        System.out.println("sharingan ativado");
    }

    @Override // Polimorfismo
    public void ataqueespecial() {
        System.out.println("Meu nome e " + nome + "e meu ataque especial e o FOGO");
    }
}
