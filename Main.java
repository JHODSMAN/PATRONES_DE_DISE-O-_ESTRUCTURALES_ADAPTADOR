import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Crear y mostrar la interfaz gráfica
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
