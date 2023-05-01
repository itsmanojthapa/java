package com.gui.AWT;
//Checkbox, RadioButton and ItemListener
//radiobutton if we group checkboxes
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class  My1Frame extends Frame implements ItemListener {
    Label l;
    java.awt.Checkbox c1,c2,c3;
    CheckboxGroup gg;

    public  My1Frame(){
        super("Check box demo");
        l = new Label("No item selected");
        gg = new CheckboxGroup();
//        c1 = new java.awt.Checkbox("Java");
        c1 = new java.awt.Checkbox("Java" , false,gg);
        c2 = new java.awt.Checkbox("Python", false ,gg);
        c3 = new java.awt.Checkbox("CPP", false , gg);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);


        setLayout(new FlowLayout());

        add(l);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s = "";
        if(c1.getState()){
            s = s +" " + c1.getLabel();
        }
        if(c2.getState()){
            s = s +" " + c2.getLabel();
        }
        if(c3.getState()){
            s = s +" " + c3.getLabel();
        }
        if(s.isEmpty()){
            s = "Nothing a selected";
        }

        l.setText(s);

    }
}

public class CheckBox {

    public static void main(String[] args) {
        My1Frame f = new My1Frame();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
