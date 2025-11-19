package Intermediario.OOP;

public class Hyuga extends Ninja{
    //Metodos de classe
    public void ByakuganAtivado(){
        System.out.println("Byakugan Ativado");
    }

    @Override // Polimorfismo
    public void ataqueespecial() {
        System.out.println("Meu nome e " + nome + "e meu ataque especial e a VELOCIDADE");
    }
}
