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

class PesquisaAudiencia {
    private int canal9;
    private int canal12;
    private int canal23;
    private int canal40;
    private int outros;

    public PesquisaAudiencia() {
        this.canal9 = 0;
        this.canal12 = 0;
        this.canal23 = 0;
        this.canal40 = 0;
        this.outros = 0;
    }

    public void registrarAudiencia(int canal) {
        switch (canal) {
            case 9:
                canal9++;
                break;
            case 12:
                canal12++;
                break;
            case 23:
                canal23++;
                break;
            case 40:
                canal40++;
                break;
            default:
                outros++;
                JOptionPane.showMessageDialog(null, "Canal inválido (outros canais).");
        }
    }

    public int getCanal9() {
        return canal9;
    }

    public int getCanal12() {
        return canal12;
    }

    public int getCanal23() {
        return canal23;
    }

    public int getCanal40() {
        return canal40;
    }

    public int getOutros() {
        return outros;
    }
}
       
            
    

