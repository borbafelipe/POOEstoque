import javax.swing.SwingUtilities;

import Interface.Frame;

public class App {

    public static void main(String[] args) {
        // Executa a interface gráfica na thread de despacho de eventos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame(); // Cria uma instância da classe Frame
            }
        });
    }
}
//         gbc.gridy = 3;
