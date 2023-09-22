package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SimpleAnimation {//implements ActionListener{
    private JFrame frame;

    public static void main(String[] args){
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();


        //frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class MyDrawPanel  {

    }
}