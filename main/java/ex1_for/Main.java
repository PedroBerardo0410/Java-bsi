/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_for;

import javax.swing.JOptionPane;
public class Main {
     public static void main(String[] args) {
         Operacao operacao = new Operacao();
         
         int numero;
         
         numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para a tabuada: "));
         
         JOptionPane.showMessageDialog(null,operacao.calcular(numero));
     
     
     }
    
}
