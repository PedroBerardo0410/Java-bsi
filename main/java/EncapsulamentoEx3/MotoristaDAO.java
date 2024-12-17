/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx3;

/**
 *
 * @author Dell
 */
public class MotoristaDAO {
    private String mensagem;
    
    public String calcular(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.mensagem = "O motorista pode ter CNH.";
        }else{
            this.mensagem = "O motorista nao pode ter CNH.";
        }
        return this.mensagem;
    }
    
}
