package com.gui.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class LBox extends Frame implements ItemListener, ActionListener
{
    List l;
    Choice c;
    TextArea a;

    LBox(){
        super("ListBox Demo");
        l = new List(4, true);
        c = new Choice();
        a = new TextArea(15,30);


        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("Apr");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(a);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == l )
                a.setText(l.getSelectedItem());
        else if (e.getSource() == c)
                a.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems(); //select and enter
        String txt = "";
        for (String x:
             list ) {
            txt+=x+"\n";
        }
        a.setText(txt);

    }
}

public class ListBoxAndChoice {
    public static void main(String[] args) {
        LBox m = new LBox();
        m.setSize(400,400);
        m.setVisible(true);
    }
}
