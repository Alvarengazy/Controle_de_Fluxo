public class Controle_IfElseIf {

    /* 
    public static void main(String[] args) {
        int idade = 16;

        if (idade >= 18) {
             System.out.println("Você é maior de idade!!!");
            } else if (idade >= 16) {
                System.out.println("Você é emancipado???");
            }else {
            System.out.println("Você é menor de idade, bloqueado!!");
        }
    }
    */
//METODO 2  

 
public static boolean maioridade(int idade){ return idade >= 18;}  
public static boolean emancipado(int idade){ return idade >= 16;}
 public static void main(String[] args) {
int idade = 17;


    if (maioridade(idade)) {
         System.out.println("Maior de Idade!!!");
    }else if(emancipado(idade)){
        System.out.println("Você é emancipado? ");
     }else {
        System.out.println("Você é menor de idade!!!");
    }
  }
}
 

