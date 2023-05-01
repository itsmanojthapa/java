package com.gui.AWT;

import java.awt.*;
import java.awt.event.*;


class  MyFrame extends Frame implements ActionListener{

    int count = 0;
    Label l;
    java.awt.Button b;

    public MyFrame(){
        super("Click Increment");
        l = new Label(" " + count);
        b = new java.awt.Button("Click");

        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(" " + count);
    }
}

public  class Button {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(400, 500);
        f.setVisible(true);
    }

}