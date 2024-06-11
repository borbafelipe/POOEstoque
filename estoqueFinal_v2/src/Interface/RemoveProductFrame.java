package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;
import Enum.*;

public class RemoveProductFrame extends JFrame {
    private JTextField nomeField, descricaoField, precoField;
    private JRadioButton roupaLabelRadioButton, roupaNumRadioButton, calcadoRadioButton;
    private ButtonGroup produtoTypeGroup;
    private JPanel specificPanel;

    public RemoveProductFrame() {
        super("Remover Produto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel para remover produtos
        JPanel removePanel = new JPanel();
        removePanel.setLayout(new GridLayout(4, 2));

        removePanel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        removePanel.add(nomeField);

        removePanel.add(new JLabel("Descrição:"));
        descricaoField = new JTextField();
        removePanel.add(descricaoField);

        removePanel.add(new JLabel("Preço:"));
        precoField = new JTextField();
        removePanel.add(precoField);

        // Grupo de botões de rádio para selecionar o tipo de produto
        roupaLabelRadioButton = new JRadioButton("Roupa (Label)");
        roupaNumRadioButton = new JRadioButton("Roupa (Num)");
        calcadoRadioButton = new JRadioButton("Calçado");
        produtoTypeGroup = new ButtonGroup();
        produtoTypeGroup.add(roupaLabelRadioButton);
        produtoTypeGroup.add(roupaNumRadioButton);
        produtoTypeGroup.add(calcadoRadioButton);

        JPanel radioPanel = new JPanel(new GridLayout(1, 3));
        radioPanel.add(roupaLabelRadioButton);
        radioPanel.add(roupaNumRadioButton);
        radioPanel.add(calcadoRadioButton);

        removePanel.add(new JLabel("Tipo de Produto:"));
        removePanel.add(radioPanel);

        JButton nextButton = new JButton("Próximo");
        removePanel.add(nextButton);

        add(removePanel, BorderLayout.NORTH);

        // Painel específico para cada tipo de produto
        specificPanel = new JPanel();
        add(specificPanel, BorderLayout.CENTER);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                specificPanel.removeAll();
                if (roupaLabelRadioButton.isSelected()) {
                    new RemoveRoupaLabelFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
                } else if (roupaNumRadioButton.isSelected()) {
                    new RemoveRoupaNumFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
                } else if (calcadoRadioButton.isSelected()) {
                    new RemoveCalcadoFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione um tipo de produto.");
                }
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class RemoveRoupaLabelFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<LabelRoupa> tamanhoComboBox;

    public RemoveRoupaLabelFrame(String nome, String descricao, float preco) {
        super("Remover Roupa (Label)");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(LabelRoupa.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton removeButton = new JButton("Remover");
        add(removeButton);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelRoupa tamanho = (LabelRoupa) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoCalcado roupaLabel = (ProdutoCalcado) Estoque.buscarProduto(nome, descricao, preco);
                if (roupaLabel != null) {
                    roupaLabel.removerQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade removida de: " + roupaLabel);
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                }
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class RemoveRoupaNumFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<NumRoupa> tamanhoComboBox;

    public RemoveRoupaNumFrame(String nome, String descricao, float preco) {
        super("Remover Roupa (Num)");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(NumRoupa.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton removeButton = new JButton("Remover");
        add(removeButton);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumRoupa tamanho = (NumRoupa) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoCalcado roupaNum = (ProdutoCalcado) Estoque.buscarProduto(nome, descricao, preco);
                if (roupaNum != null) {
                    roupaNum.removerQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade removida de: " + roupaNum);
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                }
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class RemoveCalcadoFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<NumCalcado> tamanhoComboBox;

    public RemoveCalcadoFrame(String nome, String descricao, float preco) {
        super("Remover Calçado");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(NumCalcado.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton removeButton = new JButton("Remover");
        add(removeButton);

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumCalcado tamanho = (NumCalcado) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoCalcado calcado = (ProdutoCalcado) Estoque.buscarProduto(nome, descricao, preco);
                if (calcado != null) {
                    calcado.removerQuantidade(tamanho, quantidade);
                    JOptionPane.showMessageDialog(null, "Quantidade removida de: " + calcado);
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado.");
                }
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
