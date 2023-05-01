package com.gui.AWT;


import java.awt.*;
import java.awt.Button;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.nio.file.ProviderNotFoundException;
import java.util.WeakHashMap;
import java.util.concurrent.Flow;

class Ldemo extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public Ldemo()
    {
        super("Layout Demo");

//        setLayout(new GridLayout(3,2,5,5));




        b1 = new Button("Click1");
        b2 = new Button("Click2");
        b3 = new Button("Click3");
        b4 = new Button("Click4");
        b5 = new Button("Click5");
        b6 = new Button("Click6");

        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout( gb );

        gbc.gridx = 1;
        gbc.gridy =  1;

        add(b1 , gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(b2 , gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        add(b3 , gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        add(b4 , gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        add(b5 , gbc);

        gbc.gridx = 4 ;
        gbc.gridy = 1;
        add(b6 ,gbc);


//        Flow Layout
//        * FlowLayout f1 = new FlowLayout();
//        f1.setAlignment(FlowLayout.RIGHT);
//        f1.setHgap(70);
//        setLayout(f1);


//        Border Layout
//        add(b1 , BorderLayout.NORTH);
//        add(b2 , BorderLayout.EAST);
//        add(b3 , BorderLayout.SOUTH);
//        add(b4 , BorderLayout.WEST);
//        add(b5 , BorderLayout.CENTER);
//
//        Panel p=new Panel();
//        p.setLayout(new GridLayout(3,1));
//        p.add(new Button("Mon"));
//        p.add(new Button("Tue"));
//        p.add(new Button("Wed"));
//        add(p, BorderLayout.EAST);



//        add(b1);
//        add(b2);
//        add(b3);
//        add(b4);
//        add(b5);
//        add(b6);

    }

}

class CardLayout extends Frame implements ItemListener
{
    Button b1,b2,b3,b4,b5,b6;
    TextField t1,t2,t3;
    Panel p1;
    Panel p2;
    Panel cp;
    Panel mp ;
    Checkbox c1,c2;
    java.awt.CardLayout cl;


    CardLayout(){

        super("Card Layout ");

        CheckboxGroup cg  = new  CheckboxGroup();

        c1= new Checkbox("One" , true , cg);
        c2 = new Checkbox("Two",true , cg);



        c1.addItemListener(this);
        c2.addItemListener(this);


        b1 = new Button("Click1");
        b2 = new Button("Click2");
        b3 = new Button("Click3");
        b4 = new Button("Click4");
        b5 = new Button("Click5");
        b6 = new Button("Click6");

        t1  =new TextField(10);
        t2  =new TextField(10);
        t3  =new TextField(10);

        cp = new Panel();
        cp.add(c1);
        cp.add(c2);

        p1 = new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2 = new Panel();
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);

        cl = new java.awt.CardLayout();
        mp = new Panel();
        mp.setLayout(cl);
        mp.add("One" , p1);
        mp.add("two" , p2);

        add(cp, BorderLayout.NORTH);
        add(mp, BorderLayout.CENTER);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (c1.getState() )
            cl.first(mp);
        else
            cl.last(mp);
    }
}

public class LayoutDemo {
    public static void main(String[] args) {
//        Ldemo m = new Ldemo();
//        m.setSize(400,400);
//        m.setVisible(true);
        CardLayout cl = new CardLayout();
        cl.setSize(500,500);
        cl.setVisible(true);

    }
}
