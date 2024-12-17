/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx5;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;

public class SoloView {

    public static void main(String args[]) {
        try{
        SoloCTR soloCTR = new SoloCTR();
        SoloDTO soloDTO = new SoloDTO();

        soloDTO.setAgua(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de agua: ")));

        JOptionPane.showMessageDialog(null, soloCTR.mostrarMensagem(soloDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+ e.getMessage());
        }

    }
}
