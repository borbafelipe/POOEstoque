package Produto;

import java.time.LocalDateTime;
import Produto.Enum.Disponibilidade;

public abstract class Produto {
    private int id;
    private String nome;
    private String descricao;
    private LocalDateTime horarioCadastro;
    private float valorUnitario;
    protected int quantidadeDisponivel;
    private Disponibilidade disponibilidade;
    private String codBarras;

    public Produto(int id, String nome, String descricao, LocalDateTime horarioCadastro, float valorUnitario,
            int quantidadeDisponivel, Disponibilidade disponibilidade, String codBarras) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.horarioCadastro = horarioCadastro;
        this.valorUnitario = valorUnitario;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.disponibilidade = disponibilidade;
        this.codBarras = codBarras;
    }

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

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        if (getQuantidadeDisponivel() == 0) {
            this.disponibilidade = Disponibilidade.INDISPONIVEL;
        } else {
            this.disponibilidade = Disponibilidade.DISPONIVEL;
        }
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }


    /*  public Produto(int id, String nome, String descricao, int preco, LocalDateTime horarioCadastro, Disponibilidade disponibilidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
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
     */
}
