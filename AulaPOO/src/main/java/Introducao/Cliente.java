
package Introducao;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */

public class Cliente {
    public static void main(String[] args){
        String nome, cpf;
        int idade;
        
        //nome = "Pedro Berardo";
        //cpf = "555.555.555-22";
        //System.out.println(nome+ " **** "+ cpf);
        
        
        nome = JOptionPane.showInputDialog("Informe o nome: ");
        cpf = JOptionPane.showInputDialog("Informe o cpf: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n CPF: " + cpf +"\n Idade: "+ idade+ " Anos");
        
        
        
    }
    
}// fecha classe cliente
