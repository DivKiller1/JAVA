import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginBtn = new JButton("Login");
        JLabel message = new JLabel();

        frame.setSize(300, 200);
        frame.setLayout(null);

        userLabel.setBounds(30, 30, 80, 25);
        userField.setBounds(120, 30, 120, 25);
        passLabel.setBounds(30, 70, 80, 25);
        passField.setBounds(120, 70, 120, 25);
        loginBtn.setBounds(90, 110, 100, 30);
        message.setBounds(60, 140, 200, 25);

        frame.add(userLabel); frame.add(userField);
        frame.add(passLabel); frame.add(passField);
        frame.add(loginBtn); frame.add(message);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                message.setText("Login Successful!");
            } else {
                message.setText("Invalid Credentials.");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
