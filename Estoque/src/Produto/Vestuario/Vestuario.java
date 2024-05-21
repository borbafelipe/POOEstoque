package Produto.Vestuario;

import java.util.HashMap;
import java.util.Map;

public class Vestuario {
    private String produtoID;
    private String nome;
    private String descricao;
    private int preco;
    private Map<String, Integer> quantidadePorTamanho;

    public Vestuario(String produtoID, String nome, String descricao, int preco) {
        this.produtoID = produtoID;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadePorTamanho = new HashMap<>();
    }

    // Getters e Setters

    public String getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(String produtoID) {
        this.produtoID = produtoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Map<String, Integer> getQuantidadePorTamanho() {
        return quantidadePorTamanho;
    }

    public void setQuantidadePorTamanho(Map<String, Integer> quantidadePorTamanho) {
        this.quantidadePorTamanho = quantidadePorTamanho;
    }
}
