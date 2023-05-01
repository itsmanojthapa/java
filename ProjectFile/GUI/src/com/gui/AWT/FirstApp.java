package com.gui.AWT;

import java.awt.*;
import java.awt.Button;


//Method 1
//public class FirstApp {
//    public static void main(String[] args) {
//
//        Frame f = new Frame("First App");
//
//        f.setLayout(new FlowLayout());
//
//        Label l = new Label("FIRST");
//        TextField tf = new TextField(20);
//        Button bt = new Button("Okay");
//
//
//        f.setSize(500,600);
//
//        f.add(l);
//        f.add(tf);
//        f.add(bt);
//
//        f.setVisible(true);
//    }
//}


//Method 2
//class  MyFrame extends  Frame{
//    Label l;
//    TextField tf;
//    Button b;
//
//    public  MyFrame(){
//        super("My App");
//        setLayout(new FlowLayout());
//
//        l = new Label("Name");
//        tf = new TextField(20);
//        b = new Button("OK");
//
//        add(l);
//        add(tf);
//        add(b);
//
//    }
//}
//
//public class FirstApp {
//
//    public static void main(String[] args) {
//        MyFrame mf = new MyFrame();
//        mf.setSize(500,500);
//        mf.setVisible(true);
//    }
//}




//Method 3
public class FirstApp extends Frame {
    Label l;
    TextField tf;
    java.awt.Button b;

    public  FirstApp(){
        super("My App");
        setLayout(new FlowLayout());

        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");

        add(l);
        add(tf);
        add(b);

    }

    public static void main(String[] args) {
        FirstApp mf = new FirstApp();
        mf.setSize(500,500);
        mf.setVisible(true);
    }
}
