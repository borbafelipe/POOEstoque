package Produto;

import Enum.NumRoupa;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRoupaNum extends Produto {

    private Map<NumRoupa, Integer> quantidadePorNum;

    public ProdutoRoupaNum(String nome, String descricao, float preco) {
        super(nome, descricao, preco);
        quantidadePorNum = new HashMap<>();
    }

    @Override
    public void adicionarQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof NumRoupa) {
            NumRoupa num = (NumRoupa) tamanho;
            quantidadePorNum.put(num, quantidade);
        }
    }

    @Override
    public void removerQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof NumRoupa) {
            NumRoupa num = (NumRoupa) tamanho;
            quantidadePorNum.merge(num, -quantidade, Integer::sum);
        }
    }

    @Override
    public int getQuantidade(Enum<?> tamanho) {
        if (tamanho instanceof NumRoupa) {
            NumRoupa num = (NumRoupa) tamanho;
            return quantidadePorNum.getOrDefault(num, 0);
        }
        return 0;
    }

    @Override
    public void mostrarQuantidadesPorUnidades() {
        super.mostrarQuantidadesPorUnidades();
        for (NumRoupa num : NumRoupa.values()) {
            int quantidade = getQuantidade(num);
            System.out.println(num + ": " + quantidade);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ProdutoRoupaNum [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", quantidadePorNum="
                + quantidadePorNum + ", preco=" + preco + "]";
    }
}
