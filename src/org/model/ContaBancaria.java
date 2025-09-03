package org.model;

public class ContaBancaria {
    public String numeroConta;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = "";
        this.saldo = 0;
    }

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void exibirSaldo(){
        System.out.println(this.saldo);
    }
}
