/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx3;

/**
 *
 * @author Dell
 */
public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
    public String mostrarMensagem(MotoristaDTO motoristaDTO){
        return motoristaDAO.calcular(motoristaDTO);
    }
}
