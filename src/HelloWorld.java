
//import javax.swing.*;
//import java.awt.*;
//
//public class HelloWorld extends JFrame {
//    JLabel labelHello;
//    public HelloWorld(){
//        setTitle("welcome");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setBounds(400, 150, 600,400);
//        setResizable(true);
//
//        labelHello = new JLabel();
//        labelHello.setText("hello world");
//        labelHello.setForeground(Color.BLACK);
//        labelHello.setFont(new Font("Ariel",Font.BOLD,20));
//        labelHello.setBounds(500,200,50,10);
//        add(labelHello);
//
//    }
//
//    public static void main(String[] args) {
//        new HelloWorld().setVisible(true);
//    }
//
//}

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
public class HelloWorld extends JFrame {
    JLabel labelHello;
    JLabel labelhello2;
    JTextField UserName;
    JLabel Password;
    JTextField password;

    private HelloWorld() {
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

        Password = new JLabel("password");
        Password.setBounds(100,200,100,30);
        Password.setBackground(Color.BLACK);
        Password.setFont(new Font("Arial", Font.BOLD, 20));
        add(Password);

//        adding an entry-label for password
        password = new JTextField();
        password.setBounds(200,200,100,30);
        password.setForeground(Color.BLACK);
        add(password);







    }

    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}


