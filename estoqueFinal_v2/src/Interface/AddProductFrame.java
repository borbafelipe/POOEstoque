package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;
import Enum.*;

public class AddProductFrame extends JFrame {
    private JTextField nomeField, descricaoField, precoField;
    private JRadioButton roupaLabelRadioButton, roupaNumRadioButton, calcadoRadioButton;
    private ButtonGroup produtoTypeGroup;
    private JPanel specificPanel;

    public AddProductFrame() {
        super("Adicionar Produto");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel para adicionar produtos
        JPanel addPanel = new JPanel();
        addPanel.setLayout(new GridLayout(4, 2));

        addPanel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        addPanel.add(nomeField);

        addPanel.add(new JLabel("Descrição:"));
        descricaoField = new JTextField();
        addPanel.add(descricaoField);

        addPanel.add(new JLabel("Preço:"));
        precoField = new JTextField();
        addPanel.add(precoField);

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

        addPanel.add(new JLabel("Tipo de Produto:"));
        addPanel.add(radioPanel);

        JButton nextButton = new JButton("Próximo");
        addPanel.add(nextButton);

        add(addPanel, BorderLayout.NORTH);

        // Painel específico para cada tipo de produto
        specificPanel = new JPanel();
        add(specificPanel, BorderLayout.CENTER);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                specificPanel.removeAll();
                if (roupaLabelRadioButton.isSelected()) {
                    new AddRoupaLabelFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
                } else if (roupaNumRadioButton.isSelected()) {
                    new AddRoupaNumFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
                } else if (calcadoRadioButton.isSelected()) {
                    new AddCalcadoFrame(nomeField.getText(), descricaoField.getText(), Float.parseFloat(precoField.getText()));
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

class AddRoupaLabelFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<LabelRoupa> tamanhoComboBox;

    public AddRoupaLabelFrame(String nome, String descricao, float preco) {
        super("Adicionar Roupa (Label)");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(LabelRoupa.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton addButton = new JButton("Adicionar");
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelRoupa tamanho = (LabelRoupa) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoRoupaLabel novaRoupaLabel = (ProdutoRoupaLabel) Estoque.criarEAdicionarRoupaLabel(nome, descricao, preco);
                novaRoupaLabel.adicionarQuantidade(tamanho, quantidade);

                JOptionPane.showMessageDialog(null, "Produto adicionado: " + novaRoupaLabel);
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class AddRoupaNumFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<NumRoupa> tamanhoComboBox;

    public AddRoupaNumFrame(String nome, String descricao, float preco) {
        super("Adicionar Roupa (Num)");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(NumRoupa.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton addButton = new JButton("Adicionar");
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumRoupa tamanho = (NumRoupa) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoRoupaNum novaRoupaNum = (ProdutoRoupaNum) Estoque.criarEAdicionarRoupaNum(nome, descricao, preco);
                novaRoupaNum.adicionarQuantidade(tamanho, quantidade);

                JOptionPane.showMessageDialog(null, "Produto adicionado: " + novaRoupaNum);
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

class AddCalcadoFrame extends JFrame {
    private JTextField quantidadeField;
    private JComboBox<NumCalcado> tamanhoComboBox;

    public AddCalcadoFrame(String nome, String descricao, float preco) {
        super("Adicionar Calçado");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Tamanho:"));
        tamanhoComboBox = new JComboBox<>(NumCalcado.values());
        add(tamanhoComboBox);

        add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        add(quantidadeField);

        JButton addButton = new JButton("Adicionar");
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NumCalcado tamanho = (NumCalcado) tamanhoComboBox.getSelectedItem();
                int quantidade = Integer.parseInt(quantidadeField.getText());

                ProdutoCalcado novoCalcado = (ProdutoCalcado) Estoque.criarEAdicionarCalcado(nome, descricao, preco);
                novoCalcado.adicionarQuantidade(tamanho, quantidade);

                JOptionPane.showMessageDialog(null, "Produto adicionado: " + novoCalcado);
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
