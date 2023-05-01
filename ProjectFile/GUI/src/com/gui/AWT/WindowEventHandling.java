package com.gui.AWT;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Wincloseframe extends Frame implements WindowListener
{
    Label l;
    Wincloseframe(){
        super("window evnet demo");
        l=new Label("");
        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("window opened");

    }

    @Override
    public void windowClosing(WindowEvent e) {

        l.setText("window closing");
        System.exit(0); //the zero is the status centered operating system informing informaing the operating system
                               //zero means there are no error if there is any error then we can send error code
    }

    @Override
    public void windowClosed(WindowEvent e) {

        l.setText("window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

        l.setText("windows iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("window de iconified");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("window activated");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

        l.setText("window deactivated");
    }
}

public class WindowEventHandling {
    public static void main(String[] args) {
        Wincloseframe k = new Wincloseframe();
        k.setSize(400,500);
        k.setVisible(true);

    }
}
