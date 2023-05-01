package com.gui.AWT;

import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrameArea extends Frame implements ActionListener
{
    TextField  f;
    TextArea a;
    Label l;
    Button b ;

    MyFrameArea(){
        super("TextArea Demo");
         l = new Label("          ");
         a = new TextArea(10,30);
         f = new TextField(20);
         b = new Button("Click");

         setLayout(new FlowLayout());
         b.addActionListener(this);

         add(a);
         add(l);
         add(f);
         add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        l.setText(a.getSelectedText());
//        a.append(f.getText());
        a.insert(f.getText(), a.getCaretPosition());
    }
}

public class TextAreaOperations {
    public static void main(String[] args) {
        MyFrameArea m = new MyFrameArea();
        m.setSize(400,400);
        m.setVisible(true);
    }
}
