/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx7;

/**
 *
 * @author Dell
 */
public class QuatroDAO {

    public String ordenar_Numeros(QuatroDTO quatroDTO) {
        String mensagem = " ";

        if (quatroDTO.getNum4() >= quatroDTO.getNum3()) {
            mensagem = "A ordem descrescente e: " + quatroDTO.getNum4() + " - " + quatroDTO.getNum3() + " - " + quatroDTO.getNum2() + " - " + quatroDTO.getNum1();
        } else {
            if ((quatroDTO.getNum4() >= quatroDTO.getNum2()) && (quatroDTO.getNum4() < quatroDTO.getNum3())) {
                mensagem = "A ordem decrescente e: " + quatroDTO.getNum3() + " - " + quatroDTO.getNum4() + " - " + quatroDTO.getNum2() + " - " + quatroDTO.getNum1();
            } else {
                if ((quatroDTO.getNum4() >= quatroDTO.getNum1()) && (quatroDTO.getNum4() < quatroDTO.getNum2())) {
                    mensagem = "A ordem descrescente e: " + quatroDTO.getNum3() + " - " + quatroDTO.getNum2() + " - " + quatroDTO.getNum4() + " - " + quatroDTO.getNum1();
                } else {
                    if (quatroDTO.getNum4() < quatroDTO.getNum1()) {
                        mensagem = "A ordem descrescente e: " + quatroDTO.getNum3() + " - " + quatroDTO.getNum2() + " - " + quatroDTO.getNum1() + " - " + quatroDTO.getNum4();
                    }
                }
            }
        }
        return mensagem;
    }

}
