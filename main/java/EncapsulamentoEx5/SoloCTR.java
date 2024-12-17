/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx5;

/**
 *
 * @author Dell
 */
public class SoloCTR {

    public String mostrarMensagem(SoloDTO soloDTO) {
        SoloDAO soloDAO = new SoloDAO();
        return soloDAO.analisar(soloDTO);
    }
}
