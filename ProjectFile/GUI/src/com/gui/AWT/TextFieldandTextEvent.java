package com.gui.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.util.EventListener;

class MyFramee extends Frame
{
    Label l1,l2;
    TextField f;

    MyFramee(){
        super("TextField Demo");
        l1 = new Label("No Test is Entered Yet");
        l2 = new Label("Enter key is not yet hit");
        f = new TextField(20);

        Handler h = new Handler();


        f.setEchoChar('*');   //IT will display input as a password (*)
        f.addTextListener(h);
        f.addActionListener(h);

        setLayout(new FlowLayout());

        add(l1);
        add(l2);
        add(f);

    }

    class Handler implements ActionListener , TextListener{
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(f.getText());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(f.getText());
        }
    }

}

public class TextFieldandTextEvent {
    public static void main(String[] args) {
        MyFramee m = new MyFramee();
        m.setSize(400,400);
        m.setVisible(true);
    }
}
