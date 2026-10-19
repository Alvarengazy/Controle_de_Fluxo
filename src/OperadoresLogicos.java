public class OperadoresLogicos {
/* METODO 1
    public static void main(String[] args) {
    boolean temingresso = true;
    int idade = 18;
    boolean conhecealguem = true;
    boolean bloqueado = false;

     // 1. AND (&&)
     if (idade >= 18 && temingresso) {
        System.out.println("Pode entrar");
     }

     // 2. OR (||)
     
     if (conhecealguem || temingresso) {
        System.out.println("Pode entrar!!!");
     }
   
     // 3. NOT (!)
    if (!bloqueado) {
        System.out.println("Pagou 30$, ta liberado!!");
    }
}
*/
//METODO 2
 public static void main(String[] args) {
    boolean temingresso = true;
    int idade = 18;
    boolean conhecealguem = true;
    boolean bloqueado = false;
 

     // 1. AND (&&)
     /* 
     boolean liberado = idade >= 18 && temingresso;

     if (liberado) {
        System.out.println("Ta liberado!!");
     }
    
     // 2. OR (||)
     boolean avancar = temingresso || conhecealguem;
     if (avancar) {
        System.out.println("Pode ir!! ");
     }
     */
     // 3. NOT (!)
     boolean pagounao = false;
     
     if (!pagounao) {
        System.out.println("Pagou ta");
     }
 }
}
