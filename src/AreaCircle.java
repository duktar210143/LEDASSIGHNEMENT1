import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
public class AreaCircle extends JFrame implements ActionListener {
    JLabel lbl, lbl1;
    JTextField txt1;
    JButton btn1;

    AreaCircle() {
        lbl = new JLabel("enter radius");
        lbl.setBounds(90, 50, 150, 30);
        add(lbl);

        txt1 = new JTextField();
        txt1.setBounds(90, 80, 150, 30);
        add(txt1);

        lbl1 = new JLabel("RESULT");
        lbl1.setBounds(90, 110, 150, 30);
        add(lbl1);

        btn1 = new JButton("=");
        btn1.setBounds(90, 130, 150, 30);
        add(btn1);

        btn1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e) {
        double r = Float.parseFloat(txt1.getText());
        double area;

        if (e.getSource().equals(btn1)) {
            area = r*r*Math.PI;
            lbl1.setText(String.valueOf(area));

        }

    }

    public static void main(String[] args) {
        AreaCircle areaCircle = new AreaCircle();

    }

}

