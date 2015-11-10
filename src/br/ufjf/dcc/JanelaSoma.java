package br.ufjf.dcc;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
class JanelaSoma extends JFrame{
   private final JLabel lblNumero1 = new JLabel("Número 1: ");
   private final JLabel lblNumero2 = new JLabel("Número 2: ");
   private final JLabel lblSoma = new JLabel("Soma: ");
   private final JTextField txtNumero1 = new JTextField(10);
   private final JTextField txtNumero2 = new JTextField(10);

   public JanelaSoma() throws HeadlessException {
      super("Soma");
      setLayout(new FlowLayout());
      add(lblNumero1);
      add(txtNumero1);
      add(lblNumero2);
      add(txtNumero2);
      add(lblSoma);
      txtNumero1.addActionListener((ActionEvent e) -> {
         txtNumero2.requestFocus();
      });
      txtNumero2.addActionListener(new EnterNumero2());
   }

   private class EnterNumero2 implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         Integer numero1 = Integer.parseInt(txtNumero1.getText());
         Integer numero2 = Integer.parseInt(txtNumero2.getText());
         lblSoma.setText("Soma: "+(numero1+numero2));
         txtNumero1.setText("");
         txtNumero2.setText("");
         txtNumero1.requestFocus();
      }


   }

   private class EnterNumero1 implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         txtNumero2.requestFocus();
      }

   }
   
}
