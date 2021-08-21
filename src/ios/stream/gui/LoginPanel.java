package ios.stream.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//[]
public class LoginPanel implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel email,password,success;
    private static JTextField userEmail;
    private static JPasswordField userPassword;
    private static JButton button;

    public static void main(String[]arg){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        email = new JLabel("Email Address");
        email.setBounds(20,20,90,25);
        panel.add(email);

        userEmail = new JTextField(5);
        userEmail.setBounds(120,20,165,25);
        panel.add(userEmail);

        password = new JLabel("Password");
        password.setBounds(20,50,90,25);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(20,140,165,25);
        panel.add(success);

        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String email = userEmail.getText();
        @SuppressWarnings("deprecation")
        String password1 = userPassword.getText();
        if (email.equals("Keithmuwanguzi@gmail.com") && password1.equals("Keithmunam1")) {
            JOptionPane.showMessageDialog(button, "Login Successful");
            success.setText("..This is Keith's account");
        } else if (email.equals("marthamusiimire@hotmail.com") && password1.equals("martha")) {
            JOptionPane.showMessageDialog(button, "Login successful");
            success.setText("..This is Martha's account");
        }else if (email.equals("musasizi@hotmail.com") && password1.equals("Lynn231")) {
            JOptionPane.showMessageDialog(button, "Login successful");
            success.setText("..This is Benja's account");
        }else {
              success.setText("Invalid email or password");
          }
    }
}
