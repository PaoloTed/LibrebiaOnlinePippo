package org.example;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Imposta il look-and-feel di FlatLaf
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame("Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(204, 229, 255));
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(userLabel, constraints);

        JTextField userText = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(userText, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        JPasswordField passwordText = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordText, constraints);

        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(loginButton, constraints);

        JButton registerButton = new JButton("Register");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(registerButton, constraints);

        // Aggiungi azione per il pulsante di login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Esegui il controllo delle credenziali qui
            }
        });

        // Aggiungi azione per il pulsante di registrazione
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Apri la finestra di registrazione qui
                Register.createRegistrationWindow();
            }
        });
    }
}