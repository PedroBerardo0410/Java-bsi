/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx2;

/**
 *
 * @author Dell
 */
public class FuncionarioCTR {
     FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostrarCodigoTelefone(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostrarCodigoTelefone(funcionarioDTO);
    }
    
}
