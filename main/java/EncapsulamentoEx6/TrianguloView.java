/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx6;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;

public class TrianguloView {

    public static void main(String args[]) {

        try {
            TrianguloCTR trianguloCTR = new TrianguloCTR();
            TrianguloDTO trianguloDTO = new TrianguloDTO();
            trianguloDTO.setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado A: ")));
            trianguloDTO.setLadoB(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado B: ")));
            trianguloDTO.setLadoC(Double.parseDouble(JOptionPane.showInputDialog("Informe o lado C: ")));

            JOptionPane.showMessageDialog(null, trianguloCTR.mostrarMensagem(trianguloDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }

}
