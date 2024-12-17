/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx1;

/**
 *
 * @author Dell
 */
public class ClienteDAO {
    
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi: "+ clienteDTO.getNome()+
                "\n O RG informado foi: "+clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi: "+clienteDTO.getNome()+
                "\n A idade informada foi: "+clienteDTO.getIdade();
    } 
}
