/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_for;

/**
 *
 * @author Dell
 */
public class Operacao {
    private int numero;
    private String result="";
    public String calcular(int numero){
        this.numero = numero;
        
        for(int i=1;i<=10;i++){
            this.result += this.numero + " X " + i + " = "+ this.numero*i + "\n";
        }
        return this.result;
    }
    
}
