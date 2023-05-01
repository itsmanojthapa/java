package com.gui.AWT;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class PFrame extends Frame
{
    int x,y;
    PFrame(){

        super("Painting Demo");
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                x = e.getX();
//                y = e.getY();
//                repaint(); // we cannot call paint(Graphics e) directly
//            }
//        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint(); // we cannot call paint(Graphics e) directly
            }
        });
    }
    public void paint(Graphics e){
        e.setColor(Color.RED);
//        e.fillOval(x,y,50,50);
//        e.drawOval(x,y,50,50);
        e.setFont(new Font("Times New Roman" , Font.BOLD , 30));
        e.drawString("Hello" , x,y);
    }
}

public class Paint {
    public static void main(String[] args) {
        PFrame f = new PFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
