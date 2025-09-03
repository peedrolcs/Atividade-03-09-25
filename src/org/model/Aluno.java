package org.model;

public class Aluno {
    protected String nome;
    private int idade;
    public String matricula;
    String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void exibirInformacoes(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.matricula);
        System.out.println(this.curso);
    }
}
