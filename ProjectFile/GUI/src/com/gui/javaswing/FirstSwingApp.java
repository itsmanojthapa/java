package com.gui.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count = 0;

    MyJFrame(){

        super("Swing Demo");

        setLayout(new FlowLayout());
        l=new JLabel("Clicked " + count +" Times");
        b=new JButton("Click");
        add(l);
        add(b);
//        add(new JButton("Cancel"));
        b.addActionListener(this);
// setting default button works with enter button
        getRootPane().setDefaultButton(b);
        b.setIcon(new ImageIcon("C:\\Users\\itsma\\Pictures\\unnamed.gif"));
        l.setToolTipText("hello counter "); // show when hover over l

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count +" Times");
    }
}

public class FirstSwingApp {
    public static void main(String[] args) {
        MyJFrame f=new MyJFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when window is getting closed stop program too

    }
}
