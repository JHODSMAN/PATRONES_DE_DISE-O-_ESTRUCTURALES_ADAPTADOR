import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton connectButton;
    private VGA oldDevice;
    private HDMI adapter;

    public MainFrame() {
        // Configuración de la ventana
        setTitle("Adaptador VGA a HDMI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Configuración del botón
        connectButton = new JButton("Conectar VGA a HDMI");
        connectButton.setBounds(50, 70, 200, 30);
        add(connectButton);

        // Configuración del dispositivo y adaptador
        oldDevice = new VGA();
        adapter = new VGAtoHDMIAdapter(oldDevice);

        // Acción del botón
        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adapter.connectWithHDMI();
                JOptionPane.showMessageDialog(null, "Dispositivo conectado a través de HDMI utilizando adaptador.");
            }
        });
    }
}
