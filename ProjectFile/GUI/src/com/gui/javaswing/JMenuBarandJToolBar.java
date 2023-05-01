package com.gui.javaswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

class MyFrame10 extends JFrame implements ActionListener
{
    JToolBar tb;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;

    MyFrame10(){
        super("JMenu Bar and JToolBar Demo");
        tb=new JToolBar();
        b1=new JButton(new ImageIcon("image/open.png"));
        b2=new JButton(new ImageIcon("image/2.png"));
        b3=new JButton(new ImageIcon("image/new.png"));
        b4=new JButton(new ImageIcon("image/cut.png"));
        b5=new JButton(new ImageIcon("image/file.png"));
        b6=new JButton(new ImageIcon("image/slide.png"));
        b7=new JButton(new ImageIcon("image/x.png"));

        tb.add(b1);
        tb.add(b2);
        tb.add(b3);
        tb.add(new JToolBar.Separator());
        tb.add(b4);
        tb.add(b5);
        tb.add(b6);
        tb.add(b7);

        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        add(tb, BorderLayout.NORTH);
        add(sp ,BorderLayout.CENTER);

        JMenuBar mb=new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1=new JMenuItem("save");
        JMenuItem m2=new JMenuItem("open");
        m2.setMnemonic(KeyEvent.VK_O);


        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);

        b2.setActionCommand("open");
        b2.addActionListener(this);
        m2.addActionListener(this);
        b1.addActionListener(this);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("open")){
            JFileChooser fc=new JFileChooser();
            fc.showOpenDialog(this);
            File f=fc.getSelectedFile();

            try{
                FileInputStream fi=new FileInputStream(f);
                byte b[] = new byte[fi.available()];
                fi.read(b);
                String str=new String(b);
                ta.setText(str);
                fi.close();
            }catch (Exception ae){}
        }else {
            Color col = JColorChooser.showDialog(this,"Font Color" ,Color.CYAN);
            ta.setForeground(col);
        }


    }
}

public class JMenuBarandJToolBar {
    public static void main(String[] args) {
        MyFrame10 m = new MyFrame10();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
