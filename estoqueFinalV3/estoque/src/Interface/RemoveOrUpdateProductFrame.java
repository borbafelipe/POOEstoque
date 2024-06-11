package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;
import Enum.*;

public class RemoveOrUpdateProductFrame extends JFrame {

    private JTextField quantidadeField;
    private EstoqueGUI mainGUI;
    private Produto produto;

    public RemoveOrUpdateProductFrame(String selectedProduct, EstoqueGUI mainGUI) {
        super("Remover/Alterar Produto");
        this.mainGUI = mainGUI;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Extrair informações do produto selecionado
        produto = Estoque.buscarProdutoPorString(selectedProduct);

        if (produto == null) {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            dispose();
            return;
        }

        add(new JLabel("Nome:"));
        add(new JLabel(produto.getNome()));

        add(new JLabel("Descrição:"));
        add(new JLabel(produto.getDescricao()));

        add(new JLabel("Preço:"));
        add(new JLabel(String.valueOf(produto.getPreco())));

        // Adiciona campos específicos conforme o tipo de produto
        if (produto instanceof ProdutoRoupaLabel) {
            JLabel tamanhoLabel = new JLabel("Tamanho:");
            JComboBox<LabelRoupa> tamanhoComboBox = new JComboBox<>(LabelRoupa.values());
            add(tamanhoLabel);
            add(tamanhoComboBox);

            JLabel quantidadeLabel = new JLabel("Quantidade:");
            quantidadeField = new JTextField();
            add(quantidadeLabel);
            add(quantidadeField);

            JButton updateButton = new JButton("Atualizar");
            add(updateButton);
            JButton removeButton = new JButton("Remover");
            add(removeButton);

            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    LabelRoupa tamanho = (LabelRoupa) tamanhoComboBox.getSelectedItem();
                    int quantidade = Integer.parseInt(quantidadeField.getText());
                    ((ProdutoRoupaLabel) produto).adicionarQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade atualizada: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });

            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Estoque.removerProduto(produto);
                    JOptionPane.showMessageDialog(null, "Produto removido: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });

        } else if (produto instanceof ProdutoRoupaNum) {
            JLabel tamanhoLabel = new JLabel("Tamanho:");
            JComboBox<NumRoupa> tamanhoComboBox = new JComboBox<>(NumRoupa.values());
            add(tamanhoLabel);
            add(tamanhoComboBox);

            JLabel quantidadeLabel = new JLabel("Quantidade:");
            quantidadeField = new JTextField();
            add(quantidadeLabel);
            add(quantidadeField);

            JButton updateButton = new JButton("Atualizar");
            add(updateButton);
            JButton removeButton = new JButton("Remover");
            add(removeButton);

            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    NumRoupa tamanho = (NumRoupa) tamanhoComboBox.getSelectedItem();
                    int quantidade = Integer.parseInt(quantidadeField.getText());
                    ((ProdutoRoupaNum) produto).adicionarQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade atualizada: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });

            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Estoque.removerProduto(produto);
                    JOptionPane.showMessageDialog(null, "Produto removido: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });

        } else if (produto instanceof ProdutoCalcado) {
            JLabel tamanhoLabel = new JLabel("Tamanho:");
            JComboBox<NumCalcado> tamanhoComboBox = new JComboBox<>(NumCalcado.values());
            add(tamanhoLabel);
            add(tamanhoComboBox);

            JLabel quantidadeLabel = new JLabel("Quantidade:");
            quantidadeField = new JTextField();
            add(quantidadeLabel);
            add(quantidadeField);

            JButton updateButton = new JButton("Atualizar");
            add(updateButton);
            JButton removeButton = new JButton("Remover");
            add(removeButton);

            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    NumCalcado tamanho = (NumCalcado) tamanhoComboBox.getSelectedItem();
                    int quantidade = Integer.parseInt(quantidadeField.getText());
                    ((ProdutoCalcado) produto).adicionarQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade atualizada: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });

            removeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Estoque.removerProduto(produto);
                    JOptionPane.showMessageDialog(null, "Produto removido: " + produto);
                    mainGUI.atualizarListaDeProdutos();
                    dispose();
                }
            });
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
