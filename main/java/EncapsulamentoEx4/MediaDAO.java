/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx4;

/**
 *
 * @author Dell
 */
public class MediaDAO {
    private String mensagem;
    private double mediaf;
    
    public String calcular(MediaDTO mediaDTO){
        this.mediaf = (mediaDTO.getNota1()+ mediaDTO.getNota2()/2);
        
        if (this.mediaf > 7 && this.mediaf <=10){
                    this.mensagem = "A media final e: " + this.mediaf+ " APROVADO.";
        }else{
            if (this.mediaf >=4){
                this.mensagem = "A media final e: " + this.mediaf+ " RECUPERACAO.";
            }else{
                if(this.mediaf < 4){
            this.mensagem = "A media final e: " + this.mediaf+ " REPROVADO.";
            }
            }
        }
        return this.mensagem;
        }
    }
    

