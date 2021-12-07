import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AreaTriangle extends JFrame implements ActionListener {
    JButton jb1;
    JTextField jt1,jt2;
    JLabel lbl,lbl1,lbl2;

    AreaTriangle(){
        lbl1 = new JLabel("length of triangle");
        lbl1.setBounds(90,30,150,30);
        add(lbl1);

        jt1 = new JTextField();
        jt1.setBounds(90,50,150,30);
        add(jt1);

        lbl2 = new JLabel("breadth of the triangle ");
        lbl2.setBounds(90,70,150,30);
        add(lbl2);

        jt2 = new JTextField();
        jt2.setBounds(90,90,150,30);
        add(jt2);

        lbl = new JLabel("RESULT:");
        lbl.setBounds(90,140,150,30);
        add(lbl);

        jb1 = new JButton("=");
        jb1.setBounds(90,200,100,30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        int a  = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = 0;

        if(e.getSource().equals(jb1)){
            c = (a*b)/2;
            lbl.setText(String.valueOf(c));
        }
    }

    public static void main(String[] args) {
        AreaTriangle areaTriangle = new AreaTriangle();
    }
}