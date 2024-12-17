/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx3;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
public class MotoristaView {
    public static void main(String args[]){
        try{
            MotoristaDTO motoristaDTO = new MotoristaDTO();
            MotoristaCTR motoristaCTR = new MotoristaCTR();
            
            motoristaDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
            
            JOptionPane.showMessageDialog(null, motoristaCTR.mostrarMensagem(motoristaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }
    }
}
