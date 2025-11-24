package Intermediario.Pilares;

public class Uzumaki extends Ninja{
    //Metodos de classe
    public void ModoSabio(){
        System.out.println("Modo sabio ativado");
    }

    @Override //Polimorfismo
    public void ataqueespecial() {
        System.out.println("Meu nome e " + nome + "e meu ataque especial e o VENTO");
    }
}
