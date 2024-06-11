
import Produto.*;
import Estoque.Estoque;
import Interface.EstoqueGUI;
import Interface.EstoqueGUI;

import javax.swing.SwingUtilities;

import Enum.LabelRoupa;
import Enum.NumRoupa;
import Enum.NumCalcado;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EstoqueGUI().setVisible(true);
            }
        });
        /*
        // Adicionando produtos ao estoque
        Estoque.criarEAdicionarRoupaLabel("Camisa", "Camisa de algodão", 29.99f);
        Estoque.criarEAdicionarRoupaNum("Calça", "Calça jeans", 59.99f);
        Estoque.criarEAdicionarCalcado("Sapato", "Sapato de couro", 89.99f);
        //Buscar produtos
        Produto camisa = Estoque.buscarPorNome("Camisa").get(0);
        Produto calca = Estoque.buscarPorNome("Calça").get(0);
        Produto sapato = Estoque.buscarPorNome("Sapato").get(0);

        // Adicionando quantidades aos produtos
        camisa.adicionarQuantidade(LabelRoupa.PP, 5);
        camisa.adicionarQuantidade(LabelRoupa.P, 10);
        camisa.adicionarQuantidade(LabelRoupa.M, 15);
        camisa.adicionarQuantidade(LabelRoupa.G, 20);
        camisa.adicionarQuantidade(LabelRoupa.GG, 10);
        camisa.adicionarQuantidade(LabelRoupa.XG, 5);
        camisa.adicionarQuantidade(LabelRoupa.XGG, 3);

        calca.adicionarQuantidade(NumRoupa.TAMANHO_36, 5);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_38, 10);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_40, 15);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_42, 20);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_44, 10);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_46, 5);
        calca.adicionarQuantidade(NumRoupa.TAMANHO_48, 3);

        sapato.adicionarQuantidade(NumCalcado.TAMANHO_35, 5);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_36, 10);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_37, 15);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_38, 20);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_39, 10);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_40, 5);
        sapato.adicionarQuantidade(NumCalcado.TAMANHO_41, 3);

        Estoque.listarProdutos();

        System.out.println("\nTestando adicionar e remover quantidades:");

        Estoque.criarEAdicionarRoupaLabel("Camisa 2", "Camisa branca", 19.99f);
        Produto camisa2 = Estoque.buscarPorNome("Camisa 2").get(0);
        Estoque.adicionarQuantidade(camisa2, 10);
        System.out.println("Quantidade de Camisa 2 após adicionar: " + Estoque.obterQuantidade(camisa2));

        Estoque.removerQuantidade(camisa2, 5);
        System.out.println("Quantidade de Camisa 2 após remover: " + Estoque.obterQuantidade(camisa2));

        System.out.println("\nTestando disponibilidade de um produto:");
        System.out.println("Disponibilidade de Calça no estoque: " + Estoque.verificarDisponibilidade(calca));
        Estoque.criarEAdicionarCalcado("Sandália", "Sandália de verão", 39.99f);
        Produto sandalia = Estoque.buscarPorNome("Sandália").get(0);
        System.out.println("Disponibilidade de Sandália no estoque: " + Estoque.verificarDisponibilidade(sandalia));


        // Mostrar quantidades por unidades
        System.out.println("\nQuantidades por unidades:");
        camisa.mostrarQuantidadesPorUnidades();
        calca.mostrarQuantidadesPorUnidades();
        sapato.mostrarQuantidadesPorUnidades();

        Estoque.imprimirPorNome("cam");
    } */
    }
}
