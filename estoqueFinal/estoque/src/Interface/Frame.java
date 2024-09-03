package Interface;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame{
    public Frame() {
        super("Cadastro de Produtos");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centralizar a janela

        // Criação do JPanel com GridBagLayout
        final JPanel miJPanel = new JPanel(new GridBagLayout());
        final GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Componente JLabel para o nome do produto
        final JLabel lblNome = new JLabel("Nome do Produto:   ");
        gbc.gridx = 0;
        gbc.gridy = 0;
        miJPanel.add(lblNome, gbc);

        // Componente JTextField para o nome do produto
        final JTextField txtNome = new JTextField(20); // Tamanho do campo de texto
        gbc.gridx = 1;
        gbc.gridy = 0;
        miJPanel.add(txtNome, gbc);

        // Componente JLabel para o preço do produto
        final JLabel lblPreco = new JLabel("Preço do Produto:   ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        miJPanel.add(lblPreco, gbc);

        // Componente JTextField para o preço do produto
        final JTextField txtPreco = new JTextField(20); 
        gbc.gridx = 1;
        gbc.gridy = 1;
        miJPanel.add(txtPreco, gbc);

        // Componente JButton para o cadastro
        final JButton btnCadastrar = new JButton("Cadastrar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        miJPanel.add(btnCadastrar, gbc);
        
        // Componente JButton para remover
        final JButton btnRemover = new JButton("Remover");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        miJPanel.add(btnRemover, gbc);

        // Adicionar o JPanel ao JFrame
        add(miJPanel);

        // Tornar o JFrame visível
        setVisible(true);

    }
    
}
