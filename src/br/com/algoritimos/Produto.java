package br.com.algoritimos;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
