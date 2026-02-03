package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SelectUser extends JFrame{
    private JPanel panelUserSelect;
    private JButton btnRegularEmp;
    private JButton btnHR;
    private JButton btnFinance;
    private JButton btnExit;

    public SelectUser() {
        this.setContentPane(panelUserSelect);
        this.setTitle("Select User Type");
        this.setSize(350,350);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        // confirmation on closing the window
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(SelectUser.this,
                        "Are you sure you want to close this window?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    dispose();
                    System.exit(0);
                }
            }
        });
        btnRegularEmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegularLogin();
            }
        });
        btnHR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HRLogin();
            }
        });
        btnFinance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FinanceLogin();
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(SelectUser.this,
                        "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == 0) {
                    dispose();
                    System.exit(0);
                }
            }
        });
    }
    public static void main(String[] args) {
        new SelectUser();
    }
}
