package com.gui.AWT;


import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class SBar extends  Frame implements AdjustmentListener
{
    Scrollbar red,blue, green ;
    TextField f;

    SBar(){
        super("ScrollBar Demo");
        red = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);

        f = new TextField(20);

        f.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        green.setBounds(50,200,300,30);
        blue.setBounds(50,250,300,30);

        setLayout(null);
        add(f);
        add(red);
        add(green);
        add(blue);

        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        f.setBackground(new Color(red.getValue() , green.getValue() , blue.getValue() ) );

    }
}

public class ScrollbarAndAdjustmentEvent {
    public static void main(String[] args) {
        SBar m = new SBar();
        m.setSize(400,400);
        m.setVisible(true);
    }
}
