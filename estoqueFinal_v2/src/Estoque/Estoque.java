package Estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Produto.Produto;
import Produto.ProdutoCalcado;
import Produto.ProdutoRoupaLabel;
import Produto.ProdutoRoupaNum;

public class Estoque {
    public static List<Produto> produtos = new ArrayList<>();
    private static Map<Produto, Integer> quantidades = new HashMap<>();

    public static void adicionarProduto(Produto produto) {
        produtos.add(produto);
        quantidades.put(produto, 0); // Inicialmente, a quantidade de cada produto é 0
    }

    public static void removerProduto(Produto produto) {
        produtos.remove(produto);
        quantidades.remove(produto);
    }

    public static boolean verificarDisponibilidade(Produto produto) {
        return produtos.contains(produto);
    }

    public static void adicionarQuantidade(Produto produto, int quantidade) {
        if (verificarDisponibilidade(produto)) {
            quantidades.put(produto, quantidades.get(produto) + quantidade);
        }
    }

    public static void removerQuantidade(Produto produto, int quantidade) {
        if (verificarDisponibilidade(produto)) {
            int quantidadeAtual = quantidades.get(produto);
            if (quantidadeAtual >= quantidade) {
                quantidades.put(produto, quantidadeAtual - quantidade);
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
            }
        }
    }

    public static int obterQuantidade(Produto produto) {
        return quantidades.getOrDefault(produto, 0);
    }

    public static void listarProdutos() {
        System.out.println("Produtos disponíveis no estoque:");
        for (Produto produto : produtos) {
            int quantidade = obterQuantidade(produto);
            String infoProduto = "";
            if (produto instanceof ProdutoRoupaLabel) {
                ProdutoRoupaLabel produtoRoupaLabel = (ProdutoRoupaLabel) produto;
                infoProduto = produtoRoupaLabel.toString();
            } else if (produto instanceof ProdutoRoupaNum) {
                ProdutoRoupaNum produtoRoupaNum = (ProdutoRoupaNum) produto;
                infoProduto = produtoRoupaNum.toString();
            } else if (produto instanceof ProdutoCalcado) {
                ProdutoCalcado produtoCalcado = (ProdutoCalcado) produto;
                infoProduto = produtoCalcado.toString();
            }
            System.out.println(infoProduto + " - Quantidade: " + quantidade + "\n");
        }
    }
    
    public static List<Produto> buscarPorNome(String substring) {
        List<Produto> resultados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(substring.toLowerCase())) {
                resultados.add(produto);
            }
        }
        return resultados;
    }

    public static void imprimirPorNome(String substring) {
        System.out.println("Resultados da busca por \"" + substring + "\":");
        boolean encontrou = false;
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(substring.toLowerCase())) {
                encontrou = true;
                int quantidade = obterQuantidade(produto);
                String infoProduto = "";
                if (produto instanceof ProdutoRoupaLabel) {
                    ProdutoRoupaLabel produtoRoupaLabel = (ProdutoRoupaLabel) produto;
                    infoProduto = produtoRoupaLabel.toString();
                } else if (produto instanceof ProdutoRoupaNum) {
                    ProdutoRoupaNum produtoRoupaNum = (ProdutoRoupaNum) produto;
                    infoProduto = produtoRoupaNum.toString();
                } else if (produto instanceof ProdutoCalcado) {
                    ProdutoCalcado produtoCalcado = (ProdutoCalcado) produto;
                    infoProduto = produtoCalcado.toString();
                }
                System.out.println(infoProduto + " - Quantidade: " + quantidade + "\n");
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum produto encontrado com \"" + substring + "\".\n");
        }
    }
    
    public static Produto criarEAdicionarCalcado(String nome, String descricao, float preco) {
        ProdutoCalcado novoCalcado = new ProdutoCalcado(nome, descricao, preco);
        adicionarProduto(novoCalcado);
        return novoCalcado;
    }

    public static Produto criarEAdicionarRoupaLabel(String nome, String descricao, float preco) {
        ProdutoRoupaLabel novaRoupaLabel = new ProdutoRoupaLabel(nome, descricao, preco);
        adicionarProduto(novaRoupaLabel);
        return novaRoupaLabel;
    }

    public static Produto criarEAdicionarRoupaNum(String nome, String descricao, float preco) {
        ProdutoRoupaNum novaRoupaNum = new ProdutoRoupaNum(nome, descricao, preco);
        adicionarProduto(novaRoupaNum);
        return novaRoupaNum;
    }

    public static ProdutoCalcado buscarProduto(String nome, String descricao, float preco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarProduto'");
    }
}
