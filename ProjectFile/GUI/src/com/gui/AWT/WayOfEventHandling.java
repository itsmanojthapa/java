package com.gui.AWT;

import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* Method #1 Frame Class as Listener ----------------------------------------------------------
class  FRame extends Frame implements ActionListener
{
    TextField tf;
    Button b;
    int count=0;

    FRame(){
        super("event demo");
        tf=new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
    }
}
*/

/* Method #2 Inner Class-------------------------------------------------------
class  FRame extends Frame
{
    TextField tf;
    Button b;
    int count=0;

    FRame(){
        super("event demo");
        tf=new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new MyListener());
    }

    class MyListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}
*/

/*Method#3 Anonymous Class-------------------------------------------------------
class  FRame extends Frame
{
    TextField tf;
    Button b;
    int count=0;

    FRame(){
        super("event demo");
        tf=new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);

        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tf.setText(String.valueOf(count));
            }
        });
    }
}
*/


/*
Method #4 Lambda Expression-------------------------------------------------------------------------
 */
class  FRame extends Frame
{
    TextField tf;
    Button b;
    int count=0;

    FRame(){
        super("event demo");
        tf=new TextField("0");
        b=new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
//we know very well that actionPerformed method in action event take
        //(ActionEvent e) argument
        b.addActionListener((ActionEvent e)-> {count++;tf.setText(String.valueOf(count));});
    }
}

public class WayOfEventHandling {
    public static void main(String[] args) {
        FRame f =new FRame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
