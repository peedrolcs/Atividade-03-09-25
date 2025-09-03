package org.model;

public class Livro {
    public String titulo;
    private String autor;
    protected double preco;
    int paginas;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.preco = 0;
        this.paginas = 0;
    }

    public void detalhesDoLivro(){
        System.out.println(this.titulo);
        System.out.println(this.autor);
        System.out.println(this.preco);
        System.out.println(this.paginas);
    }

    public String getTitulo() {
        return titulo;
    }

}
