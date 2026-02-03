package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RegularLogin extends JFrame {
    private JPanel panelLogin;
    private JTextField txtUser;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JButton btnBack;

    public RegularLogin() {
        this.setContentPane(this.panelLogin);
        this.setTitle("Login");
        this.setSize(350,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // confirmation on closing the window
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(RegularLogin.this,
                        "Are you sure you want to close this window?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    dispose();
                    System.exit(0);
                }
            }
        });
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(RegularLogin.this,
                        "Are you sure you want to go back to Select User Window?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    new SelectUser();
                    dispose();
                }
            }
        });
    }
}
