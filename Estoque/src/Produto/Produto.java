package Produto;

import java.time.LocalDateTime;
import Produto.Enum.Disponibilidade;

public abstract class Produto {
    private int id;
    private String nome;
    private String descricao;
    private LocalDateTime horarioCadastro;
    private int preco;
    private Disponibilidade disponibilidade;

    public Produto(int id, String nome, String descricao, int preco, LocalDateTime horarioCadastro, Disponibilidade disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.horarioCadastro = horarioCadastro;
        this.disponibilidade = disponibilidade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getHorarioCadastro() {
        return horarioCadastro;
    }

    public void setHorarioCadastro(LocalDateTime horarioCadastro) {
        this.horarioCadastro = horarioCadastro;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
