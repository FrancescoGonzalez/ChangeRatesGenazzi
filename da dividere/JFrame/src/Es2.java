import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Es2 extends JFrame {
    JButton Azzera = new JButton("Azzera");
    JButton Calcola = new JButton("Calcola");
    JTextField Risultato = new JTextField();
    JTextField A = new JTextField();
    JTextField B = new JTextField();
    JLabel RisultatoLabel = new JLabel("Risultato");
    JLabel ALabel = new JLabel("A");
    JLabel BLabel = new JLabel("B");

    public Es2() {
        setTitle("Esercizio 2");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,150);
        JPanel pText = new JPanel();

        GridLayout l = new GridLayout(4,2);
        l.setHgap(5); //distanza orizzontale tra i component
        l.setVgap(5); //distanza verticale tra i component
        pText.setLayout(l);

        pText.add(RisultatoLabel);
        pText.add(Risultato);
        pText.add(ALabel);
        pText.add(A);
        pText.add(BLabel);
        pText.add(B);

        Azzera.setEnabled(false);

        pText.add(Azzera);
        pText.add(Calcola);

        getContentPane().add(pText, BorderLayout.CENTER);

        Azzera.addActionListener(new ActionListenerClass());
        Calcola.addActionListener(new ActionListenerClass());



    }
    public class ActionListenerClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource()==Azzera) {
                Risultato.setText("");
                A.setText("");
                B.setText("");
                Azzera.setEnabled(false);
                Calcola.setEnabled(true);
            } else if (e.getSource()==Calcola) {
                Risultato.setText("" + (Integer.parseInt(A.getText()) + Integer.parseInt(B.getText())));
                Azzera.setEnabled(true);
                Calcola.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        new Es2().setVisible(true);
    }
}
