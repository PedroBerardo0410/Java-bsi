/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx6;

/**
 *
 * @author Dell
 */
public class TrianguloCTR {

    TrianguloDAO trianguloDAO = new TrianguloDAO();

    public String mostrarMensagem(TrianguloDTO trianguloDTO) {
        return trianguloDAO.verificarTriangulo(trianguloDTO);
    }

}
