package com.gui.javaswing;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class MyFrame1 extends JFrame
{
    MyFrame1(){
        super("JTextField Demo");
        JTextField tf1 = new JTextField(15);

        // we use it only for number or make it formatted for dat or currency or percentage
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);

//        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft=new NumberFormatter(nf);

        JFormattedTextField tf3 = new JFormattedTextField(nft);

        nft.setAllowsInvalid(false);//don't allow invalid input
        nft.setMaximum(100);

        tf3.setValue(0);
        tf3.setColumns(15);
        setLayout(new FlowLayout());
        tf2.setColumns(15);
        tf2.setValue(0);

        JTextArea ta = new JTextArea(30,30);
//        ta.setText();
//        ta.copy();
//        ta.paste();
        add(tf1);
        add(tf2);
        add(tf3);

    }
}

public class JTextFieldJformattedTextField {
    public static void main(String[] args) {
        MyFrame1 m = new MyFrame1();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
