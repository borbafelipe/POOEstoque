import Enum.LabelRoupa;
import Enum.NumCalcado;
import Enum.NumRoupa;
import Estoque.Estoque;
import Produto.Produto;

public class App {
    public static void main(String[] args) {
        Produto novoProduto = new Produto("Camisa", "Camisa de algodão", 29.99f);
        Estoque.adicionarProduto(novoProduto);

        // Adicionando quantidades
        novoProduto.adicionarQuantidade(LabelRoupa.M, 10);
        novoProduto.adicionarQuantidade(NumRoupa.TAMANHO_38, 5);
        novoProduto.adicionarQuantidade(NumCalcado.TAMANHO_42, 3);

        // Consultando quantidades
        System.out.println("Quantidade de M: " + novoProduto.getQuantidade(LabelRoupa.M)); // 10
        System.out.println("Quantidade de Tamanho 38: " + novoProduto.getQuantidade(NumRoupa.TAMANHO_38)); // 5
        System.out.println("Quantidade de Tamanho 42: " + novoProduto.getQuantidade(NumCalcado.TAMANHO_42)); // 3

        // Removendo quantidades
        novoProduto.removerQuantidade(LabelRoupa.M, 3);
        System.out.println("Quantidade de M após remoção: " + novoProduto.getQuantidade(LabelRoupa.M)); // 7

        // Tentativa de remover quantidade maior do que disponível (deve lançar exceção)
        try {
            novoProduto.removerQuantidade(NumCalcado.TAMANHO_42, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Quantidade a remover é maior que a disponível.
        }

        // Listar produtos no estoque
        Estoque.listarProdutos();
    }
}
