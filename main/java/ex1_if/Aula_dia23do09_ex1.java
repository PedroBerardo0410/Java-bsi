
package ex1_if;

import javax.swing.JOptionPane;

public class Aula_dia23do09_ex1 {
  

    public static void main(String[] args) {
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null ,"O solo se encontra na situacao de  " + solo.calcular(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de agua: "))
        ));
    }
}
