package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SimpleGui3 implements ActionListener{
    private JFrame frame;

    public static void main(String[] args){
        SimpleGui3 gui = new SimpleGui3();
        gui.go();
    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("change colors");
        button.addActionListener(this);

        MyDrawPanel2 drawPanel = new MyDrawPanel2();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}
class MyDrawPanel2 extends JPanel {
    public void paintComponent(Graphics g) {
       Graphics2D g2d = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color (red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color (red, green, blue);

        GradientPaint gradient = new GradientPaint (70, 70, startColor, 150, 150, endColor);
        g2d.setPaint (gradient);
        g2d.fillOval (70, 70, 100, 100);
    }
}
