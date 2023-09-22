import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Es1 extends JFrame {
    JCheckBox ch1 = new JCheckBox("bold");
    JCheckBox ch2 = new JCheckBox("italic");
    JTextField txt = new JTextField();
    public Es1() {
        setTitle("JCheckbox Test");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,150);


        JPanel p1 = new JPanel();
        p1.add(ch1);
        p1.add(ch2);

        getContentPane().add(p1, BorderLayout.SOUTH);
        getContentPane().add(txt, BorderLayout.NORTH);

        ch1.addItemListener(new ItemListenerOnTxt());
        ch2.addItemListener(new ItemListenerOnTxt());


    }


    private class ItemListenerOnTxt implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            if (e.getSource()==ch1) {
                if (e.getStateChange() == 1) {
                    txt.setFont(new Font("Serif", Font.BOLD, 11));
                } else {
                    txt.setFont(new Font("Serif", Font.PLAIN, 11));
                }
            } else if (e.getSource()==ch2) {
                if (e.getStateChange() == 1) {
                    txt.setFont(new Font("Serif", Font.ITALIC, 11));
                } else {
                    txt.setFont(new Font("Serif", Font.PLAIN, 11));
                }
            }
        }
    }


    public static void main(String[] args) {
        new Es1().setVisible(true);



    }
}