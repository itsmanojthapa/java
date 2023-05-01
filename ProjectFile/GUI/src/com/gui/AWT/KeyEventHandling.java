package com.gui.AWT;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
import java.util.Date;

class Keyeventhandle extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;

    Keyeventhandle(){
        super("Key event demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);
        l1.setBounds(30,50,100,20);
        l2.setBounds(30,80,100,20);
        l3.setBounds(30,100,100,20);
        l4.setBounds(30,120,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
    }

    @Override
    public void keyPressed(KeyEvent e) {

        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {

        l3.setText("Key Typed");
        l4.setText(  new Date(e.getWhen()) + " " );
    }
}


public class KeyEventHandling {

    public static void main(String[] args) {
        Keyeventhandle k = new Keyeventhandle();
        k.setSize(400,500);
        k.setVisible(true);

    }

}
