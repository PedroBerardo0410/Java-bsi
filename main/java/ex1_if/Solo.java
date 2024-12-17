
package ex1_if;


public class Solo {
    private String mensagem ="";
    private int agua;
    public String calcular(int agua){
        this.agua = agua;
        
        if(this.agua <= 10){
            this.mensagem =  "Rochoso";
        }
        else if(this.agua >10 && this.agua <=40){
            this.mensagem = "Firme";
        }
        else if(this.agua >40 && this.agua <=80){
            this.mensagem = "Pantanoso";
        }
        else{
            this.mensagem = "Quantidade Invalida";
        }
        return this.mensagem;
    }
    
}
