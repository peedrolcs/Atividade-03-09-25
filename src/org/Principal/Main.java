package org.Principal;

import org.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro( "Volkswagen", "Jetta", 2025, 120.000 );
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        System.out.println("=================================================");

        Livro livro = new Livro();
        Livro livro1 = new Livro();

        livro.detalhesDoLivro();
        livro1.detalhesDoLivro();

        System.out.println("===================================================");

        Aluno aluno = new Aluno("Pedro", 18, "7", "Engenharia de Software");

        System.out.println("===================================================");

        Cliente cliente = new Cliente("Pedro", "7");
        cliente.exibirDadosDoCliente();

        System.out.println("===================================================");

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.exibirSaldo();

    }
}