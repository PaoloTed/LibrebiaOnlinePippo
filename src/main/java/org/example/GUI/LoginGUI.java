package org.example.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginGUI() {
        super("Login");

        // Creazione dei componenti dell'interfaccia
        JLabel usernameLabel = new JLabel("Username: ");
        JLabel passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Aggiunta dei componenti al layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 0, 10);
        panel.add(usernameLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 0, 10);
        panel.add(usernameField, c);

        c.gridx = 0;
        c.gridy = 1;
        c.insets = new Insets(10, 10, 10, 10);
        panel.add(passwordLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.insets = new Insets(10, 0, 10, 10);
        panel.add(passwordField, c);

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0.0;
        panel.add(loginButton, c);

        // Aggiunta del pulsante di registrazione
        c.gridx = 0;
        c.gridy = 3;
        panel.add(registerButton, c);

        // Aggiunta degli ascoltatori dei pulsanti
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) { new LoginGUI(); }}
