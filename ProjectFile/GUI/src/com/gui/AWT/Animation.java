package com.gui.AWT;

import java.awt.*;

class Ann extends Frame implements Runnable
{
    int x,y,tx,ty;
    Ann(){
        super("Animation Demo");
        x=100;
        y=100;
        tx = ty=1;

        Thread t=new Thread(this);
        t.start();

    }
    public  void paint(Graphics e){
        e.setColor(Color.CYAN);
        e.fillOval(x,y,50,50);
    }

    @Override
    public void run() {
        while (true){
            x+=tx;
            y+=ty;
//because hight of the ball is 50
            if(x<0 || x>450)
                tx=tx*-1;
            if(y<20 || y>450)
                ty=ty*-1;
            repaint();

            try {
                Thread.sleep(5);
            }catch (Exception e){}
        }
    }
}

public class Animation {
    public static void main(String[] args) {
        Ann a = new Ann();
        a.setSize(500, 500);
        a.setVisible(true);
    }
}
