package Desafios.Desafio05;

public abstract class ContaBancaria implements Conta {
    //TODO: Crie uma classe abstrata chamada ContaBancaria que implementa a interface Conta.

    public int numeroDaConta;
    public String nomeNinja;
    public double saldo;

    public ContaBancaria(String nomeNinja, int numeroDaConta, double saldo) {
        this.nomeNinja = nomeNinja;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

}
