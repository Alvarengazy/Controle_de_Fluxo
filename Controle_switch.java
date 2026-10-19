public class Controle_switch {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Menu!!!");

        int numero= 7;

        switch (numero) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Finaliza");
                
        }
    }
}
