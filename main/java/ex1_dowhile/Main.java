/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_dowhile;

/**
 *
 * @author Dell
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        PesquisaAudiencia pesquisa = new PesquisaAudiencia();
        int canal;

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Digite o número do canal (0 para encerrar):");

            if (input == null) {
                break;
            }

            try {
                canal = Integer.parseInt(input);

                if (canal == 0) {
                    break;
                }

                pesquisa.registrarAudiencia(canal);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
            }
        }

        String resultado = "Audiência por canal:\n" +
                "Canal 9: " + pesquisa.getCanal9() + "\n" +
                "Canal 12: " + pesquisa.getCanal12() + "\n" +
                "Canal 23: " + pesquisa.getCanal23() + "\n" +
                "Canal 40: " + pesquisa.getCanal40() + "\n" +
                "Outros canais: " + pesquisa.getOutros();

        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

