package br.ufjf.dcc;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula03Exr01 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      JanelaSoma janela = new JanelaSoma();
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(120,160);
      janela.setLocationRelativeTo(null);
      janela.setVisible(true);
   }
   
}
