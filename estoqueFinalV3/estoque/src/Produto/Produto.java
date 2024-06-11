package Produto;

import Estoque.Estoque;

public abstract class Produto {

    protected int id;
    protected String nome;
    protected String descricao;
    protected float preco;

    public Produto(String nome, String descricao, float preco) {
        this.id = Estoque.obterQuantidade(null) + 1;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    // Métodos abstratos para adicionar, remover e obter quantidades
    public abstract void adicionarQuantidade(Enum<?> tamanho, int quantidade);

    public abstract void removerQuantidade(Enum<?> tamanho, int quantidade);

    public abstract int getQuantidade(Enum<?> tamanho);

    // Método para mostrar quantidades por unidades
    public void mostrarQuantidadesPorUnidades() {
        System.out.println("Quantidades disponíveis para " + nome + ":");
    }
}
