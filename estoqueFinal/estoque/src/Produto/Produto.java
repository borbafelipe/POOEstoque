package Produto;

import Enum.LabelRoupa;
import Enum.NumRoupa;
import Enum.NumCalcado;
import Estoque.Estoque;

import java.util.HashMap;
import java.util.Map;

public class Produto implements RoupaLabel, RoupaNum, Calcado {
    private int id;
    private String nome;
    private String descricao;
    private float preco;

    private Map<LabelRoupa, Integer> estoqueLabelRoupa;
    private Map<NumRoupa, Integer> estoqueNumRoupa;
    private Map<NumCalcado, Integer> estoqueCalcado;

    // Construtor para produto roupa num
    public Produto(String nome, String descricao, float preco) {
        this.id = Estoque.getQuantidade() + 1;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;

        // Inicializa os estoques
        this.estoqueLabelRoupa = new HashMap<>();
        this.estoqueNumRoupa = new HashMap<>();
        this.estoqueCalcado = new HashMap<>();

        // Inicializa os mapas com valores 0
        for (LabelRoupa label : LabelRoupa.values()) {
            estoqueLabelRoupa.put(label, 0);
        }
        for (NumRoupa num : NumRoupa.values()) {
            estoqueNumRoupa.put(num, 0);
        }
        for (NumCalcado num : NumCalcado.values()) {
            estoqueCalcado.put(num, 0);
        }
    }

    public static void novoItem(String nome, String descricao, float preco) {
        Produto produto = new Produto(nome, descricao, preco);
        Estoque.adicionarProduto(produto);
    }

    // Métodos da interface RoupaLabel
    @Override
    public void adicionarQuantidade(LabelRoupa label, int quantidade) {
        estoqueLabelRoupa.put(label, estoqueLabelRoupa.get(label) + quantidade);
    }

    @Override
    public void removerQuantidade(LabelRoupa label, int quantidade) {
        int quantidadeAtual = estoqueLabelRoupa.get(label);
        if (quantidade > quantidadeAtual) {
            throw new IllegalArgumentException("Quantidade a remover é maior que a disponível.");
        }
        estoqueLabelRoupa.put(label, quantidadeAtual - quantidade);
    }

    @Override
    public int getQuantidade(LabelRoupa label) {
        return estoqueLabelRoupa.get(label);
    }

    // Métodos da interface RoupaNum
    @Override
    public void adicionarQuantidade(NumRoupa numRoupa, int quantidade) {
        estoqueNumRoupa.put(numRoupa, estoqueNumRoupa.get(numRoupa) + quantidade);
    }

    @Override
    public void removerQuantidade(NumRoupa numRoupa, int quantidade) {
        int quantidadeAtual = estoqueNumRoupa.get(numRoupa);
        if (quantidade > quantidadeAtual) {
            throw new IllegalArgumentException("Quantidade a remover é maior que a disponível.");
        }
        estoqueNumRoupa.put(numRoupa, quantidadeAtual - quantidade);
    }

    @Override
    public int getQuantidade(NumRoupa numRoupa) {
        return estoqueNumRoupa.get(numRoupa);
    }

    // Métodos da interface Calcado
    @Override
    public void adicionarQuantidade(NumCalcado numCalcado, int quantidade) {
        estoqueCalcado.put(numCalcado, estoqueCalcado.get(numCalcado) + quantidade);
    }

    @Override
    public void removerQuantidade(NumCalcado numCalcado, int quantidade) {
        int quantidadeAtual = estoqueCalcado.get(numCalcado);
        if (quantidade > quantidadeAtual) {
            throw new IllegalArgumentException("Quantidade a remover é maior que a disponível.");
        }
        estoqueCalcado.put(numCalcado, quantidadeAtual - quantidade);
    }

    @Override
    public int getQuantidade(NumCalcado numCalcado) {
        return estoqueCalcado.get(numCalcado);
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
    }
}
