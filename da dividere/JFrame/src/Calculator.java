import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton sum = new JButton("+");
    JButton sott = new JButton("-");
    JButton div = new JButton("/");
    JButton molt = new JButton("x");
    JButton clear = new JButton("CE");
    JButton equal = new JButton("Enter");
    JLabel txt = new JLabel("");
    double cache = 0;
    String sign = null;
    public Calculator() {
        setTitle("calculator");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,450);
        JPanel p = new JPanel();

        txt.setPreferredSize(new Dimension(350, 150));

        GridLayout l = new GridLayout(4,4);
        l.setHgap(5); //distanza orizzontale tra i component
        l.setVgap(5); //distanza verticale tra i component
        p.setLayout(l);

        b0.addActionListener(new ActionListenerClass());
        b1.addActionListener(new ActionListenerClass());
        b2.addActionListener(new ActionListenerClass());
        b3.addActionListener(new ActionListenerClass());
        b4.addActionListener(new ActionListenerClass());
        b5.addActionListener(new ActionListenerClass());
        b6.addActionListener(new ActionListenerClass());
        b7.addActionListener(new ActionListenerClass());
        b8.addActionListener(new ActionListenerClass());
        b9.addActionListener(new ActionListenerClass());
        sum.addActionListener(new ActionListenerClass());
        sott.addActionListener(new ActionListenerClass());
        molt.addActionListener(new ActionListenerClass());
        div.addActionListener(new ActionListenerClass());
        clear.addActionListener(new ActionListenerClass());
        equal.addActionListener(new ActionListenerClass());

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(div );
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(molt);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(sott);
        p.add(clear);
        p.add(b0);
        p.add(equal);
        p.add(sum);

        getContentPane().add(p, BorderLayout.CENTER);
        getContentPane().add(txt, BorderLayout.NORTH);
    }

    public class ActionListenerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b0) {
                txt.setText(txt.getText() + "0");
            } else if (e.getSource() == b1) {
                txt.setText(txt.getText() + "1");
            } else if (e.getSource() == b2) {
                txt.setText(txt.getText() + "2");
            } else if (e.getSource() == b3) {
                txt.setText(txt.getText() + "3");
            } else if (e.getSource() == b4) {
                txt.setText(txt.getText() + "4");
            } else if (e.getSource() == b5) {
                txt.setText(txt.getText() + "5");
            } else if (e.getSource() == b6) {
                txt.setText(txt.getText() + "6");
            } else if (e.getSource() == b7) {
                txt.setText(txt.getText() + "7");
            } else if (e.getSource() == b8) {
                txt.setText(txt.getText() + "8");
            } else if (e.getSource() == b9) {
                txt.setText(txt.getText() + "9");
            } else if (e.getSource() == sum) {
                sign = "sum";
                cache = Double.parseDouble(txt.getText());
                txt.setText("");
            } else if (e.getSource() == sott) {
                if (txt.getText().equals("")) {
                    txt.setText(txt.getText() + "-");
                } else {
                    sign = "sott";
                    cache = Double.parseDouble(txt.getText());
                    txt.setText("");
                }
            } else if (e.getSource() == molt) {
                sign = "molt";
                cache = Double.parseDouble(txt.getText());
                txt.setText("");
            } else if (e.getSource() == div) {
                sign = "div";
                cache = Double.parseDouble(txt.getText());
                txt.setText("");
            } else if (e.getSource() == clear) {
                txt.setText("");
                cache = 0;
            } else if (e.getSource() == equal) {
                txt.setText(String.valueOf(calculus(cache, sign, Double.parseDouble(txt.getText()))));
            }
        }
    }
    public static double calculus(double first, String sign, double second) {
        switch (sign) {
            case "sum":
                return first + second;
            case "molt":
                return first * second;
            case "div":
                return first / second;
            case "sott":
                return first - second;
            default:
                return 00000000000000000;
        }

    }
    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }
}
