
import java.util.Scanner;

public class reservasHotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bienvenido a la app de gestion de reservas. ");
        System.out.print("ingrese el numero de clientes maximo 5:  ");
        int numeroClientes = input.nextInt();
        System.out.println("A continucion dijite los datos requeridos:");

        int[][] matriz = new {
            {´101, 102, 103, 104, 105},
            {´201, 202, 203, 204, 205}
        }; 

       for (int i = 0; i < numeroClientes; i++) {
        switch (i) {
            case 0 -> {
                System.out.println("primer usuario");
                System.out.print("ingrese su nombre: ");
                String primerUsuario = input.next();
                System.out.print("numero de Dias que se desea hospedar en el hotel: ");
                int diasUsuarioUno = input.nextInt();
                }
            case 1 -> {
                System.out.println("segundo usuario");
                System.out.print("ingrese su nombre: ");
                String segundoUsuario = input.next();
                System.out.print("numero de Dias que se desea hospedar en el hotel: ");
                int diasUsuarioDos = input.nextInt();
                }
            case 2 -> {
                System.out.println("tercer usuario");
                System.out.print("ingrese su nombre: ");
                String tercerUsuario = input.next();
                System.out.print("numero de Dias que se desea hospedar en el hotel: ");
                int diasUsuarioTres = input.nextInt();
                }
            case 3 -> {
                System.out.println("cuarto usuario");
                System.out.print("ingrese su nombre: ");
                String cuartoUsuario = input.next();
                System.out.print("numero de Dias que se desea hospedar en el hotel: ");
                int diasUsuarioCuatro = input.nextInt();
                }
            case 4 -> {
                System.out.println("quinto usuario");
                System.out.print("ingrese su nombre: ");
                String quintoUsuario = input.next();
                System.out.print("numero de Dias que se desea hospedar en el hotel: ");
                int diasUsuarioCinco = input.nextInt();
                }
            default -> System.out.println("¡Numero de usarios sobre capasidad de sistema!");
        }   
        
        
       }
    
    }
}