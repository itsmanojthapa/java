package com.gui.AWT;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


class MFrame extends Frame implements MouseListener, MouseMotionListener
{
    Label l,l2;
    MFrame(){
        super("mouse event demo");
        l=new Label("");
        l2 = new Label("");
        setLayout(null);
        l.setBounds(10,50,100,20);
        l2.setBounds(10,70,100,20);
        add(l);
        add(l2);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("mouse pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        l.setText("mouse  released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        l.setText("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        l.setText("mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        l.setText("mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        l.setText("mouse moved");
        l2.setText("(" + e.getX() + ", " + e.getY() + ")");
    }
}


public class MouseEventHandling {

    public static void main(String[] args) {
        MFrame k = new MFrame();
        k.setSize(400,500);
        k.setVisible(true);

    }

}