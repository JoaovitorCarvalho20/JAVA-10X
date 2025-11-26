package Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nomeNinja, int numeroDaConta, double saldo) {
        super(nomeNinja, numeroDaConta, saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da conta é " + saldo);
    }

    @Override
    public void depositar(double valor) {
       if (valor <= 0 ) {
           System.out.println( "Não é possivel fazer o deposito desse valor");
       }else {
           System.out.println("Foi depositado o valor de " + valor + " na conta");
           saldo = saldo + valor;
       }

    }
}
