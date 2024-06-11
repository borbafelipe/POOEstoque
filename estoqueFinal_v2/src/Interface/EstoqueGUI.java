package Interface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Produto.*;
import Estoque.Estoque;
import Enum.*;

public class EstoqueGUI extends JFrame {
    private JTextArea displayArea;

    public EstoqueGUI() {
        super("Sistema de Estoque");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel inicial com botões para adicionar e remover produtos
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1));

        JButton addButton = new JButton("Adicionar Produto");
        JButton removeButton = new JButton("Remover Produto");
        JButton searchButton = new JButton("Buscar Produto");

        mainPanel.add(addButton);
        mainPanel.add(removeButton);
        mainPanel.add(searchButton);

        add(mainPanel, BorderLayout.NORTH);

        // Área de texto para exibir resultados
        displayArea = new JTextArea(20, 50);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        add(scrollPane, BorderLayout.CENTER);

        // Ações dos botões
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddProductFrame();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveProductFrame();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchQuery = JOptionPane.showInputDialog("Digite o nome do produto para buscar:");
                displayArea.append("Resultados da busca por \"" + searchQuery + "\":\n");
                Estoque.imprimirPorNome(searchQuery);
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EstoqueGUI().setVisible(true);
            }
        });
    }
}
