package org.model;

public class Cliente {
    protected String nome;
    String cpf;

    public Cliente() {
        this.nome = "";
        this.cpf = "";
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public void exibirDadosDoCliente(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
}
