/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx5;

/**
 *
 * @author Dell
 */
public class SoloDAO {
    
    public String analisar(SoloDTO soloDTO){
        int agua = soloDTO.getAgua();
        String mensagem;
        
        if(agua <= 10){
            mensagem = "O Solo se classifica como Rochosa com "+agua+" pontos de agua.";           
        }
        else{
            if(agua >10 && agua <=40){
                    mensagem = "O Solo se classifica como Firme com "+agua+" pontos de agua.";
            }
            else{
                if(agua > 40 && agua <=80){
                    mensagem = "O Solo se classifica como Pantanoso com "+agua+" pontos de agua.";
                }
                else{
                    mensagem = "Quantidade de agua invalida.";
                }
            }
        }
        return mensagem;
    }
    
}
