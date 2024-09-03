package Estoque;

import Produto.Produto;

import java.util.ArrayList;

public class Estoque {
    public static ArrayList<Produto> estoque = new ArrayList<>();

    public static void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    public static void listarProdutos() {
        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
    }

    public static int getQuantidade() {
        return estoque.size();
    }
}
