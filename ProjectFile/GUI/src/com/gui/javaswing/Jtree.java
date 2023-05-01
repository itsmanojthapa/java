package com.gui.javaswing;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

class MyFrame4 extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;
    MyFrame4(){
        super("JTree Demo");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C:\\GUI\\src\\com\\gui");
        File f=new File("C:\\GUI\\src\\com\\gui");

        for(File x:f.listFiles()){

            if(x.isDirectory()){
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
                for (File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }else
                 root.add(new DefaultMutableTreeNode(x.getName()));
        }
        tree=new JTree(root);
        label=new JLabel("No Files Selected");

        tree.addTreeSelectionListener(this);

        JScrollPane sp=new JScrollPane(tree);//adds scroll bar

//        add(tree,BorderLayout.CENTER);
        add(sp, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        label.setText(e.getPath().toString());
    }
}

public class Jtree {
    public static void main(String[] args) {
        MyFrame4 m = new MyFrame4();
        m.setSize(500,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
