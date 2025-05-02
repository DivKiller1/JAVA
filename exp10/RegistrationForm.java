import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmLabel = new JLabel("Confirm Password:");
        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField confirmField = new JPasswordField();
        JButton registerBtn = new JButton("Register");
        JLabel message = new JLabel();

        frame.setLayout(null);
        frame.setSize(350, 300);

        nameLabel.setBounds(30, 30, 120, 25);
        nameField.setBounds(160, 30, 140, 25);
        emailLabel.setBounds(30, 60, 120, 25);
        emailField.setBounds(160, 60, 140, 25);
        passLabel.setBounds(30, 90, 120, 25);
        passField.setBounds(160, 90, 140, 25);
        confirmLabel.setBounds(30, 120, 120, 25);
        confirmField.setBounds(160, 120, 140, 25);
        registerBtn.setBounds(110, 160, 100, 30);
        message.setBounds(30, 200, 280, 25);

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerBtn); frame.add(message);

        registerBtn.addActionListener(e -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                message.setText("All fields are required.");
            } else if (!email.contains("@")) {
                message.setText("Invalid email format.");
            } else if (!pass.equals(confirm)) {
                message.setText("Passwords do not match.");
            } else {
                message.setText("Registration successful!");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
