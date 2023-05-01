package com.gui.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

//we cannot extend multiple class , we can also use inner classes
class MAFrame extends Frame{
    MAFrame(){
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
        /*Unknown inner class
        * addWindowListener(new WindowAdapter(){
        * public void windowClosing(WindowEvent we){
        * System.exit(0);
        * }
        * }
        * */
    }

    class MyWindowAdapter extends WindowAdapter
    {
        public  void windowClosing(WindowEvent we){
            System.exit(0);

        }
    }

}

public class AdapterClasses {
    public static void main(String[] args) {
        MAFrame k = new MAFrame();
        k.setSize(400,500);
        k.setVisible(true);

    }

}
