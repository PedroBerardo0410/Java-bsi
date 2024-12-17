/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx1;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
public class ClienteView {
    public static void main(String args[]){
        try{
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG: "));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe qual sua idade: ")));
            
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRG(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }
    }
}
