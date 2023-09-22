package GUI;

import javax.swing.*;
import java.awt.event.*;

public class SimpleGui2 implements ActionListener{
    private JButton button;
    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");

        button.addActionListener(this); // agggiunge actionListener alla lista di interessi di button

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) { //il bottone chiama questo metodo
       button.setText("I've been clicked!");
    }
}
