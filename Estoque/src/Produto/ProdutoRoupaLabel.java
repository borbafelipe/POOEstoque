package Produto;

import Enum.LabelRoupa;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRoupaLabel extends Produto {
    private Map<LabelRoupa, Integer> quantidadePorNum;

    public ProdutoRoupaLabel(String nome, String descricao, float preco) {
        super(nome, descricao, preco);
        quantidadePorNum = new HashMap<>();
    }

    @Override
    public void adicionarQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof LabelRoupa) {
            LabelRoupa num = (LabelRoupa) tamanho;
            quantidadePorNum.put(num, quantidade);
        }
    }

    @Override
    public void removerQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof LabelRoupa) {
            LabelRoupa num = (LabelRoupa) tamanho;
            quantidadePorNum.merge(num, -quantidade, Integer::sum);
        }
    }

    @Override
    public int getQuantidade(Enum<?> tamanho) {
        if (tamanho instanceof LabelRoupa) {
            LabelRoupa num = (LabelRoupa) tamanho;
            return quantidadePorNum.getOrDefault(num, 0);
        }
        return 0;
    }

    @Override
    public void mostrarQuantidadesPorUnidades() {
        super.mostrarQuantidadesPorUnidades();
        for (LabelRoupa num : LabelRoupa.values()) {
            int quantidade = getQuantidade(num);
            System.out.println(num.name() + ": " + quantidade); // Usar num.name() para obter o nome do enum
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ProdutoRoupaLabel [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", quantidadePorNum="
                + quantidadePorNum + ", preco=" + preco + "]";
    }
}
