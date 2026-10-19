public class Controle_IfElse {
/* 
    public static void main(String[] args) {
        int idade = 20;
        

        if (idade >= 18) {
            System.out.println("Você é maior de idade!!");
        } else {
            System.out.println("Você é menor de idade!!!");
        }
    }
*/

//METODO 2


public static boolean maioridade(int idade){ return idade >= 18;}
public static void main(String[] args) {
    
  
    if (maioridade(10)) {
        System.out.println("Maior de idade!!!");
    } else {
        System.out.println("Você é menor de idade");
    }
    
}
}
