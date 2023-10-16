import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Es3 extends JFrame{
    JButton Calcola = new JButton("Calcola");
    JTextField A = new JTextField();
    JTextField B = new JTextField();
    JTextField C = new JTextField();
    JLabel Ris1 = new JLabel("0");
    JLabel Ris2 = new JLabel("0");
    JLabel Err = new JLabel("-");

    public Es3() {
        setTitle("Esercizio 3");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,150);
        JPanel p = new JPanel();

        GridLayout l = new GridLayout(3,4);
        l.setHgap(5); //distanza orizzontale tra i component
        l.setVgap(5); //distanza verticale tra i component
        p.setLayout(l);

        JLabel title = new JLabel("Ris. Eq. 2o Grado");
        title.setFont(new Font("Serif", Font.BOLD, 24));

        p.add(new JLabel("A"));
        p.add(A);
        p.add(new JLabel("Ris1"));
        p.add(Ris1);
        p.add(new JLabel("B"));
        p.add(B);
        p.add(new JLabel("Ris2"));
        p.add(Ris2);
        p.add(new JLabel("C"));
        p.add(C);
        p.add(new JLabel("Err"));
        p.add(Err);

        Calcola.addActionListener(new ActionListenerClass());

        getContentPane().add(title, BorderLayout.NORTH);
        getContentPane().add(p, BorderLayout.CENTER);
        getContentPane().add(Calcola, BorderLayout.SOUTH);

    }
    public class ActionListenerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(A.getText());
            double b = Double.parseDouble(B.getText());
            double c = Double.parseDouble(C.getText());
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante > 0) {
                double ris1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double ris2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                Ris1.setText("" + ris1);
                Ris2.setText("" + ris2);
            } else if (discriminante == 0) {
                double ris = (-b + Math.sqrt(discriminante)) / (2 * a);
                Ris1.setText("" + ris);
                Ris2.setText("-");
                Err.setText(("-"));
            } else if (discriminante < 0) {
                Ris1.setText("-");
                Ris2.setText("-");
                Err.setText(("impossibile"));
            }
        }
    }
    public static void main(String[] args) {
        new Es3().setVisible(true);
    }
}
