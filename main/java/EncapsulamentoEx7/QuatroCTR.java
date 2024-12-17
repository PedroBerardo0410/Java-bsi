/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx7;

/**
 *
 * @author Dell
 */
public class QuatroCTR {
    QuatroDAO quatroDAO = new QuatroDAO();
    
    public String mostrarMensagem(QuatroDTO quatroDTO) {
        return quatroDAO.ordenar_Numeros(quatroDTO);
    }
}
