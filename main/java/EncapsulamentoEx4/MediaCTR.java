/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx4;

/**
 *
 * @author Dell
 */
public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String mostrarMensagem(MediaDTO mediaDTO){
        return mediaDAO.calcular(mediaDTO);
    }
}
