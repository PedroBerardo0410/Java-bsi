/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx7;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;

public class QuatroView {
    public static void main(String args[]) {
        
        try{
        QuatroCTR quatroCTR = new QuatroCTR();
        QuatroDTO quatroDTO = new QuatroDTO();
        
        quatroDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1: ")));
        quatroDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2: ")));
        quatroDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 3: ")));
        quatroDTO.setNum4(Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 4: ")));
        
        JOptionPane.showMessageDialog(null,quatroCTR.mostrarMensagem(quatroDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
        
    }
}
