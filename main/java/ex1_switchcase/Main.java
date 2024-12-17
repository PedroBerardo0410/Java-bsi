/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_switchcase;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
        
        int ope, n1,n2;
        
        ope = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação: "));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
        
        JOptionPane.showMessageDialog(null, operacao.calcular(ope, n1, n2));
    
    }
    
}
