/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx4;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;
public class MediaView {
    public static void main(String args[]){
        try{
            MediaDTO mediaDTO = new MediaDTO();
            MediaCTR mediaCTR = new MediaCTR();
            
            mediaDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")));
            mediaDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")));
            
            JOptionPane.showMessageDialog(null, mediaCTR.mostrarMensagem(mediaDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }
    }
}
