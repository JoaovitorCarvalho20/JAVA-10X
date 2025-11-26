package Desafios.Desafio05;

public class Banco {
    public static void main(String[] args) {

       // OBJ 1 teste das funcoes da conta corrente
        ContaCorrente n1 = new ContaCorrente("Naruto", 123, 20);
        n1.depositar(30);
        n1.consultarSaldo();

        System.out.println("============================================");

        // OBJ 2 teste das funcoes da conta poupanca
        ContaPoupanca n2 = new ContaPoupanca("Sasuke", 321, 20);
        n2.depositar(30);
        n2.consultarSaldo();
    }
}
