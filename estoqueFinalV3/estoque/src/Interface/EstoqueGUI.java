package Interface;

import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;

public class EstoqueGUI extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> productList;
    private JTextField searchField;

    public EstoqueGUI() {
        super("Estoque");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        productList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(productList);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        searchField = new JTextField();
        panel.add(searchField);

        JButton searchButton = new JButton("Buscar");
        panel.add(searchButton);

        JButton addButton = new JButton("Adicionar Produto");
        panel.add(addButton);

        add(panel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2));

        JButton updateButton = new JButton("Alterar");
        buttonPanel.add(updateButton);

        JButton removeButton = new JButton("Remover");
        buttonPanel.add(removeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText();
                List<Produto> resultados = Estoque.buscarPorNome(searchTerm);
                atualizarListaDeProdutos(resultados);
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddProductFrame(EstoqueGUI.this);
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = productList.getSelectedValue();
                if (selectedProduct != null) {
                    new RemoveOrUpdateProductFrame(selectedProduct, EstoqueGUI.this);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para alterar.");
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProduct = productList.getSelectedValue();
                if (selectedProduct != null) {
                    Produto produto = Estoque.buscarProdutoPorString(selectedProduct);
                    if (produto != null) {
                        Estoque.removerProduto(produto);
                        atualizarListaDeProdutos();
                        JOptionPane.showMessageDialog(null, "Produto removido: " + selectedProduct);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para remover.");
                }
            }
        });

        atualizarListaDeProdutos();
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void atualizarListaDeProdutos() {
        listModel.clear();
        for (Produto produto : Estoque.produtos) {
            listModel.addElement(produto.toString());
        }
    }

    public void atualizarListaDeProdutos(List<Produto> produtos) {
        listModel.clear();
        for (Produto produto : produtos) {
            listModel.addElement(produto.toString());
        }
    }

    public static void main(String[] args) {
        new EstoqueGUI();
    }
}
