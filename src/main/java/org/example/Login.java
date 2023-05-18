package org.example;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame("Login");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel loginPanel = new JPanel();
            placeLoginComponents(loginPanel, frame);

            frame.add(loginPanel);

            // Imposta la dimensione del frame a 500x500
            frame.setSize(new Dimension(500, 500));

            // Disabilita il pulsante di ingrandimento dello schermo
            frame.setResizable(false);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void placeLoginComponents(JPanel panel, JFrame frame) {
        panel.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridBagLayout());
        centerPanel.setBackground(new Color(204, 229, 255));
        panel.add(centerPanel, BorderLayout.CENTER);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel userLabel = new JLabel("Username:");
        constraints.gridx = 0;
        constraints.gridy = 0;
        centerPanel.add(userLabel, constraints);

        JTextField userText = new JTextField(20);
        constraints.gridx = 1;
        constraints.gridy = 0;
        centerPanel.add(userText, constraints);

        JLabel passwordLabel = new JLabel("Password:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        centerPanel.add(passwordLabel, constraints);

        JPasswordField passwordText = new JPasswordField(20);
        constraints.gridx = 1;
        constraints.gridy = 1;
        centerPanel.add(passwordText, constraints);

        JButton loginButton = new JButton("Login");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        centerPanel.add(loginButton, constraints);

        JButton registerButton = new JButton("Register");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        centerPanel.add(registerButton, constraints);
        //

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Esegui il controllo delle credenziali qui
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel registerPanel = new JPanel();
                Register.placeRegistrationComponents(registerPanel, frame);
                frame.remove(panel);
                frame.add(registerPanel);
                frame.pack();
                frame.revalidate();
                frame.repaint();
                frame.setSize(new Dimension(500, 500));
            }
        });
    }
}