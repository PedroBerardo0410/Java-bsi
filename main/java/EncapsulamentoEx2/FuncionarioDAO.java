/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx2;

/**
 *
 * @author Dell
 */
public class FuncionarioDAO {
    
    public String mostrarCodigoTelefone(FuncionarioDTO funcionarioDTO){
        return "Informe o codigo: "+ funcionarioDTO.getCodigo()+
                "\n Informe o telefone: "+funcionarioDTO.getTelefone();
    }
    
}
