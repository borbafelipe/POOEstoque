package Estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Produto.Vestuario.Vestuario;

public class Estoque {
    private Map<String, Vestuario> itens;

    public Estoque() {
        this.itens = new HashMap<>();
    }

  
    public void adicionarItem(Vestuario item) {
        this.itens.put(item.getProdutoID(), item);
    }

  
    public void removerItem(String produtoID) {
        this.itens.remove(produtoID);
    }

    // Verifica se um determinado produto está disponível no estoque
    public boolean verificarDisponibilidade(String produtoID, String tamanho) {
        Vestuario item = this.itens.get(produtoID);
        return item != null && item.getQuantidadePorTamanho().containsKey(tamanho) && item.getQuantidadePorTamanho().get(tamanho) > 0;
    }

    // Método para realizar uma venda
    public boolean realizarVenda(String produtoID, String tamanho, String vendedorID) {
        Vestuario item = this.itens.get(produtoID);
        if (item != null && item.getQuantidadePorTamanho().containsKey(tamanho) && item.getQuantidadePorTamanho().get(tamanho) > 0) {
            item.getQuantidadePorTamanho().put(tamanho, item.getQuantidadePorTamanho().get(tamanho) - 1);
            return true; // Venda realizada com sucesso
        }
        return false; // Venda não realizada (produto indisponível)
    }

    // Lista todos os itens no estoque
    public List<Vestuario> listarItens() {
        return new ArrayList<>(this.itens.values());
    }
}
