package app;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame {
    public SignUp(App app){
        this.setTitle("Sign-Up");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        this.setPreferredSize(new Dimension(350,500));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JButton signupButton = new JButton("Sign-Up");

        signupButton.addActionListener(e ->{
            String id = usernameField.getText();
            char[] password = passwordField.getPassword();
            User u = new User(id, password);
            System.out.println(u.getStudentID());
            System.out.println(u.getPassword());
            app.addUsers(u);
            new MyFrame(app);
            this.dispose();
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(signupButton);

        setVisible(true);
    }
}
