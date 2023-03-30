package secondDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    
    public LoginFrame() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        
        // Create the username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        
        // Create the password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        
        // Create the login button and add an ActionListener to handle button clicks
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        
        // Create a panel to hold the components
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);
        
        // Add the panel to the JFrame and show the form
        add(panel);
        setVisible(true);
    }
    
    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        
        // TODO: Check the username and password against a database or other authentication mechanism
        
        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            abc a = new abc();
            a.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect username or password.");
        }
    }
    
    public static void main(String[] args) {
        new LoginFrame();
    }
}
