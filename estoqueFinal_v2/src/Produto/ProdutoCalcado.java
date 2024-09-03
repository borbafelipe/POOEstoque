package Produto;

import Enum.NumCalcado;


import java.util.HashMap;
import java.util.Map;

public class ProdutoCalcado extends Produto {
    private Map<NumCalcado, Integer> quantidadePorTamanho;

    public ProdutoCalcado(String nome, String descricao, float preco) {
        super(nome, descricao, preco);
        quantidadePorTamanho = new HashMap<>();
    }
    
  
    @Override
    public void adicionarQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof NumCalcado) {
            NumCalcado num = (NumCalcado) tamanho;
            quantidadePorTamanho.put(num, quantidade);
        }
    }

    @Override
    public void removerQuantidade(Enum<?> tamanho, int quantidade) {
        if (tamanho instanceof NumCalcado) {
            NumCalcado num = (NumCalcado) tamanho;
            quantidadePorTamanho.merge(num, -quantidade, Integer::sum);
        }
    }

    @Override
    public int getQuantidade(Enum<?> tamanho) {
        if (tamanho instanceof NumCalcado) {
            NumCalcado num = (NumCalcado) tamanho;
            return quantidadePorTamanho.getOrDefault(num, 0);
        }
        return 0;
    }

    @Override
    public void mostrarQuantidadesPorUnidades() {
        super.mostrarQuantidadesPorUnidades();
        for (NumCalcado num : NumCalcado.values()) {
            int quantidade = getQuantidade(num);
            System.out.println(num + ": " + quantidade);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ProdutoCalcado [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", quantidadePorTamanho="
                + quantidadePorTamanho + ", preco=" + preco + "]";
    }
}
