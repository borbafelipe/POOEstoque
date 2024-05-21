
import Estoque.Estoque;
import Produto.Vestuario.Vestuario;

public class Main {

    public static void main(String[] args) {
        // Criando o estoque
        Estoque estoque = new Estoque();

        // Adicionando alguns produtos ao estoque
        Vestuario camiseta = new Vestuario("001", "Camiseta", "Camiseta de algodão", 30);
        camiseta.getQuantidadePorTamanho().put("M", 10);
        Vestuario calca = new Vestuario("002", "Calça Jeans", "Calça jeans azul", 50);
        calca.getQuantidadePorTamanho().put("M", 15);
        Vestuario tenis = new Vestuario("003", "Tênis", "Tênis esportivo", 80);
        tenis.getQuantidadePorTamanho().put("40", 5);

        estoque.adicionarItem(camiseta);
        estoque.adicionarItem(calca);
        estoque.adicionarItem(tenis);

        // Exibindo o estoque inicial
        System.out.println("Itens no estoque:");
        listarEstoque(estoque);

        // Realizando algumas vendas
        realizarVenda(estoque, "001", "M");
        realizarVenda(estoque, "002", "M");
        realizarVenda(estoque, "003", "40");

        // Exibindo o estoque após as vendas
        System.out.println("\nItens no estoque após as vendas:");
        listarEstoque(estoque);
    }

    // Método para realizar uma venda
    private static void realizarVenda(Estoque estoque, String produtoID, String tamanho) {
        boolean vendaRealizada = estoque.realizarVenda(produtoID, tamanho, "V001");
        if (vendaRealizada) {
            System.out.println("Venda do produto " + produtoID + " no tamanho " + tamanho + " realizada com sucesso!");
        } else {
            System.out.println("Não foi possível realizar a venda do produto " + produtoID + " no tamanho " + tamanho + ". Produto indisponível.");
        }
    }

    // Método para listar os itens no estoque
    private static void listarEstoque(Estoque estoque) {
        for (Vestuario item : estoque.listarItens()) {
            System.out.println("Produto: " + item.getNome() + ", Quantidade disponível: " + calcularQuantidadeDisponivel(item));
        }
    }

    // Método para calcular a quantidade disponível de um produto
    private static int calcularQuantidadeDisponivel(Vestuario produto) {
        int quantidadeTotal = 0;
        for (int quantidade : produto.getQuantidadePorTamanho().values()) {
            quantidadeTotal += quantidade;
        }
        return quantidadeTotal;
    }
}
