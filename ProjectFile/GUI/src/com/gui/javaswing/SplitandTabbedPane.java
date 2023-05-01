package com.gui.javaswing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class MyFrame7 extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
    JList list;
    JLabel lbl;

    MyFrame7(){
        super("Split Demo");

        String cols[] ={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};

        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.CYAN);
        JScrollPane p2=new JScrollPane(lbl);

        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
        sp.setDividerLocation(100);
        add(sp);
//        JTabbedPane tp=new JTabbedPane();
//        tp.addTab("Colors",p1);
//        tp.addTab("Lable",p2);
//        add(tp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String) list.getSelectedValue();
        switch (str){
            case "RED": lbl.setBackground(Color.red); break;
            case "GREEN": lbl.setBackground(Color.GREEN); break;
            case  "YELLOW": lbl.setBackground(Color.YELLOW); break;
            case  "MAGENTA": lbl.setBackground(Color.MAGENTA); break;
            case  "ORANGE" : lbl.setBackground(Color.ORANGE); break;
            case  "BLACK" : lbl.setBackground(Color.BLACK); break;
            case "BLUE": lbl.setBackground(Color.BLUE); break;
        }
    }
}

public class SplitandTabbedPane {
    public static void main(String[] args) {
        MyFrame7 m = new MyFrame7();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
