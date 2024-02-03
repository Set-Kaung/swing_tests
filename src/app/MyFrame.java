package app;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyFrame extends JFrame{
    public MyFrame(App app){
        this.setPreferredSize(new Dimension(350,500));
        
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 0, 5, 5);
        
        
        JLabel usernameLbl = new JLabel("Username: ");
        JLabel passwordLbl = new JLabel("Password: ");
        JTextField usernameTf = new JTextField();
        JPasswordField passwordF = new JPasswordField();
        usernameTf.setPreferredSize(new Dimension(250, 50));
        passwordF.setPreferredSize(new Dimension(250, 50));

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String name = usernameTf.getText();
            char[] password = passwordF.getPassword();
            User u = app.getUser(name);
            System.out.println(u.getStudentID());
            System.out.println(u.getPassword());
            if(u.equals(null)){
                JOptionPane.showMessageDialog(this,"User Not Found", "Not Found!", JOptionPane.ERROR_MESSAGE);
            }
            if(Arrays.equals(u.getPassword(), password)){
                JOptionPane.showMessageDialog(this, "Login Successful!", "Suceess!", JOptionPane.PLAIN_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Password Incorrect!","Error!", JOptionPane.ERROR_MESSAGE);
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(usernameLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(usernameTf, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(passwordLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(passwordF, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(loginButton, gbc);

        

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }




}