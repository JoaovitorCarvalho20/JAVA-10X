package Intermediario.Pilares;

public class Ninja {
    public String nome;
    public int idade;
    public String aldeia;

    public void ataqueespecial (){ // Sera usada nos exemplos de polimorfismo
        System.out.println("Meu nome e " + nome  + " e esse e meu ataque especial");
    }


    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", aldeia='" + aldeia + '\'' +
                '}';
    }
}
