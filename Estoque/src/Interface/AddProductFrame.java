package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;


public class AddProductFrame extends JFrame {
    private JTextField nomeField, descricaoField, precoField;
    private JRadioButton roupaLabelRadioButton, roupaNumRadioButton, calcadoRadioButton;
    private ButtonGroup produtoTypeGroup;
    private EstoqueGUI mainGUI;

    public AddProductFrame(EstoqueGUI mainGUI) {
        super("Adicionar Produto");
        this.mainGUI = mainGUI;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Descrição:"));
        descricaoField = new JTextField();
        add(descricaoField);

        add(new JLabel("Preço:"));
        precoField = new JTextField();
        add(precoField);

        roupaLabelRadioButton = new JRadioButton("Roupa (Label)");
        roupaNumRadioButton = new JRadioButton("Roupa (Num)");
        calcadoRadioButton = new JRadioButton("Calçado");
        produtoTypeGroup = new ButtonGroup();
        produtoTypeGroup.add(roupaLabelRadioButton);
        produtoTypeGroup.add(roupaNumRadioButton);
        produtoTypeGroup.add(calcadoRadioButton);

        add(new JLabel("Tipo de Produto:"));
        JPanel radioPanel = new JPanel(new GridLayout(1, 3));
        radioPanel.add(roupaLabelRadioButton);
        radioPanel.add(roupaNumRadioButton);
        radioPanel.add(calcadoRadioButton);
        add(radioPanel);

        JButton nextButton = new JButton("Próximo");
        add(nextButton);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (roupaLabelRadioButton.isSelected()) {
                    criarEAdicionarRoupaLabel();
                } else if (roupaNumRadioButton.isSelected()) {
                    criarEAdicionarRoupaNum();
                } else if (calcadoRadioButton.isSelected()) {
                    criarEAdicionarCalcado();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, selecione um tipo de produto.");
                }
                mainGUI.atualizarListaDeProdutos();
                dispose();
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void criarEAdicionarRoupaLabel() {
        String nome = nomeField.getText();
        String descricao = descricaoField.getText();
        float preco = Float.parseFloat(precoField.getText());
        ProdutoRoupaLabel novaRoupaLabel = new ProdutoRoupaLabel(nome, descricao, preco);
        Estoque.adicionarProduto(novaRoupaLabel);
        JOptionPane.showMessageDialog(null, "Produto adicionado: " + novaRoupaLabel);
    }

    private void criarEAdicionarRoupaNum() {
        String nome = nomeField.getText();
        String descricao = descricaoField.getText();
        float preco = Float.parseFloat(precoField.getText());
        ProdutoRoupaNum novaRoupaNum = new ProdutoRoupaNum(nome, descricao, preco);
        Estoque.adicionarProduto(novaRoupaNum);
        JOptionPane.showMessageDialog(null, "Produto adicionado: " + novaRoupaNum);
    }

    private void criarEAdicionarCalcado() {
        String nome = nomeField.getText();
        String descricao = descricaoField.getText();
        float preco = Float.parseFloat(precoField.getText());
        ProdutoCalcado novoCalcado = new ProdutoCalcado(nome, descricao, preco);
        Estoque.adicionarProduto(novoCalcado);
        JOptionPane.showMessageDialog(null, "Produto adicionado: " + novoCalcado);
    }
}
