import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bmi extends JFrame implements ActionListener {
    JButton jb1;
    JTextField jt1,jt2;
    JLabel lbl,lbl1,lbl2;

    Bmi(){

        lbl1 =new JLabel("ENTER weight in kilograms");
        lbl1.setBounds(90,20,170,40);
        add(lbl1);

        jt1 = new JTextField();
        jt1.setBounds(90,50,150,30);
        add(jt1);

        lbl2 = new JLabel("ENTER height in meter squared");
        lbl2.setBounds(90,80,150,30);
        add(lbl2);

        jt2 = new JTextField();
        jt2.setBounds(90,100,150,30);
        add(jt2);

        lbl = new JLabel("RESULT");
        lbl.setBounds(90,140,150,30);
        add(lbl);

        jb1 = new JButton("/");
        jb1.setBounds(90,200,100,30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e) {
        Float a = Float.parseFloat(jt1.getText());
        Float b = Float.parseFloat(jt2.getText());
        Float difference ;

        if(e.getSource().equals(jb1)){
            difference = a/b;
            lbl.setText(String.valueOf(difference));
        }

    }

    public static void main(String[] args) {
        Bmi multiply = new Bmi();
    }
}
