package com.gui.javaswing;

import com.gui.AWT.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;

class MyFrame2 extends JFrame implements ActionListener
{
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    JTextField tf;

    MyFrame2(){
        super("CheckBox and Radio Button demo");
        tf = new JTextField("demp" , 20);
        tf.setBounds(10,20,100,80);
        c1 = new JCheckBox("BOLD");
//        c1.setMnemonic(HEIGHT);
        c1.setMnemonic(KeyEvent.VK_B);


        c2 = new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);

        r1=new JRadioButton("lower" );
        r2=new JRadioButton("UPPER");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        r1.setActionCommand("lower");
        r2.setActionCommand("UPPER");

        setLayout(new FlowLayout());

        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);

    }

    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand())
        {
            case "lower": tf.setText((tf.getText().toLowerCase()));
                               break;
            case "UPPER": tf.setText(tf.getText().toUpperCase(Locale.ROOT));
                               break;
        }
        int b=0,i=0;
        if(c1.isSelected()) b= Font.BOLD;
        if(c2.isSelected()) i = Font.ITALIC;
        Font f=new Font("Times New Roman" , b | i,15);
        tf.setFont(f);

    }
}

public class JCheckBoxandRadioButton {

    public static void main(String[] args) {
        MyFrame2 m = new MyFrame2();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
