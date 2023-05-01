package com.gui.AWT;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyMenu extends Frame
{
    Menu file,sub;
    MenuItem open,save,close, closeall;
    CheckboxMenuItem auto;
    TextField tf;

    MyMenu(){
        super("Menu Demo");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeall = new MenuItem("Close all");

        auto=new CheckboxMenuItem("Auto Save");
        file=new Menu("File");
        sub=new Menu("Close");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeall);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf=new TextField(10);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent e)-> tf.setText("Open"));
        save.addActionListener((ActionEvent e)-> tf.setText("Save") );
        close.addActionListener((ActionEvent e)-> tf.setText("Close"));
        closeall.addActionListener((ActionEvent e)-> tf.setText("Close all"));

        auto.addItemListener((ItemEvent e)->{
            if(auto.getState()){
                tf.setText("Auto On");
            }else
                tf.setText("Auto Off");
        } );
    }

}

public class MenuDemo {
    public static void main(String[] args) {
        MyMenu m = new MyMenu();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
