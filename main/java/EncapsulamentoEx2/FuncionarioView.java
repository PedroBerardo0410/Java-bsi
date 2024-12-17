/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx2;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
public class FuncionarioView {
   public static void main(String args[]){
        try{
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setCodigo(JOptionPane.showInputDialog("Informe o codigo: "));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o telefone: "));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarCodigoTelefone(funcionarioDTO));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }
    }
}
