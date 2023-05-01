package com.gui.javaswing;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

class  MyFrame3 extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    MyFrame3(){
        super("Borders for swing components");
        l=new JLabel("Name");
        tf =new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);

//        Border br = BorderFactory.createLoweredBevelBorder();
//        Border br= BorderFactory.createLineBorder(Color.CYAN, 5);
//        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Login");
        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.CYAN),"Login", TitledBorder.CENTER,TitledBorder.TOP);
        p.setBorder(br);
        b.setBorder(BorderFactory.createRaisedBevelBorder());

        setLayout(new FlowLayout());
        add(p);
    }

}

public class Borders {

    public static void main(String[] args) {
        MyFrame3 m = new MyFrame3();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
