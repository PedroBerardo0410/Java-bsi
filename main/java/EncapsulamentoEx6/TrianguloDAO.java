/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EncapsulamentoEx6;

/**
 *
 * @author Dell
 */
public class TrianguloDAO {

    public String verificarTriangulo(TrianguloDTO trianguloDTO) {
        double ladoA = trianguloDTO.getLadoA();
        double ladoB = trianguloDTO.getLadoB();
        double ladoC = trianguloDTO.getLadoC();
        String mensagem = "Nao e um triangulo";

        if (ladoA + ladoB <= ladoC && ladoA + ladoC <= ladoB && ladoB + ladoC <= ladoA) {
            return mensagem;
        }

        if (ladoA != ladoB && ladoB != ladoC && ladoA != ladoC) {
            mensagem = "Escaleno";
        }
        if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            mensagem = "Isosceles";
        }
        if (ladoA == ladoB && ladoB == ladoC && ladoA == ladoC) {
            mensagem = "Equilatero";
        }
        return mensagem;

    }
}
