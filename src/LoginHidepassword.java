import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class LoginHidepassword extends JFrame implements ActionListener {
    JLabel labelHello;
    JLabel labelhello2;
    JTextField UserName;
    JLabel Password1;
    JPasswordField password;
    JCheckBox login;

    private LoginHidepassword() {
        setTitle("LOG-IN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(800, 700, 600, 400);
        setResizable(true);
        setLayout(null);

        labelHello = new JLabel("login");
        labelHello.setForeground(Color.BLACK);
        labelHello.setBounds(200,10,100,100);
        labelHello.setFont(new Font("Arial", Font.BOLD, 30));
        add(labelHello);

        labelhello2 = new JLabel("UserName");
        labelhello2.setForeground(Color.BLACK);
        labelhello2.setBounds(100,100,100,20);
        labelhello2.setFont(new Font("Arial", Font.BOLD, 20));
        add(labelhello2);



        UserName = new JTextField();
        UserName.setBounds(200,100,100,30);
        UserName.setForeground(Color.BLACK);

        add(UserName);

//        adding a new label password and adding it to the GUI frame

        Password1 = new JLabel("password");
        Password1.setBounds(100,200,100,30);
        Password1.setBackground(Color.BLACK);
        Password1.setFont(new Font("Arial", Font.BOLD, 20));
        add(Password1);

//        adding an entry-label for password
        password = new JPasswordField();
        password.setBounds(200,200,100,30);
        password.setForeground(Color.BLACK);
        add(password);

        login = new JCheckBox();
        login.setBounds(200,230,100,30);
        add(login);

        login.addActionListener(this);



    }

    public static void main(String[] args) {
        new LoginHidepassword().setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(login))
        {
            if(login.isSelected()){
                password.setEchoChar((char) 0);

            }
            else{
                password.setEchoChar('-');
            }
        }

    }
}