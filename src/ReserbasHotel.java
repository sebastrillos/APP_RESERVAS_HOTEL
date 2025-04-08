
import java.util.Scanner;

public class ReserbasHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la app de gestion de reservas. ");
        System.out.print("Ingrese el numero de clientes maximo 10:  ");
        int numeroClientes = input.nextInt();
        System.out.println("A continuacion realize el proceso de reserva:");

        int[] libres = {101, 102, 103, 104, 105, 201, 202, 203, 204, 205}; 
        int[] ocupadas = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        for (int i = 0; i < numeroClientes; i++) {
            System.err.println();
            System.out.println("nuevo usuario");
            System.out.print("ingrese su nombre: ");
            String usuario = input.next();
            System.out.print("numero de noches que se desea hospedar en el hotel: ");
            int nochesUsuario = input.nextInt();
            System.out.println("Las habitaciones disponibles son: ");
        for (int g = 0; g < libres.length; g++) {
            System.out.print(libres[g] + ", ");
        }
        System.out.println();
        System.out.print("Cual habitacion eligio: ");
        int habitacionUsuario = input.nextInt();
        System.out.print("ingrese el presio de la habitacion por cada noche:  ");
        double presioHabitacion = input.nextDouble();
        double valorTotal = presioHabitacion * nochesUsuario;
        for (int j = 0; j < libres.length; j++) {
               if (libres[j] == habitacionUsuario) {
                System.out.println("¿desea canselar la reserva?");
                System.out.println("1) si cancelar.");
                System.out.println("2) No, continuar.");
                byte cancelar = input.nextByte();
                if (cancelar==2) {
                    ocupadas[j] = libres[j];
                   libres[j] = 0;
                   System.out.println("Reporte final:");
        System.out.println("Cliente: " + usuario + " - Habitacion: " + habitacionUsuario + " - Total a pagar: " + valorTotal);
        System.out.println("habitaciones ocupadas: ");
        for (int y = 0; y < ocupadas.length; y++) {
                System.out.print(ocupadas[y] + ", ");
        }
        System.out.println();
                System.out.println("habitaciones disponibles: ");
                for (int s = 0; s < libres.length; s++) {
                    System.out.print(libres[s] + ", ");
                }
                } else {
                    System.out.println("reserva cancelada!!");
                    break;
                }
            }
        }
       
    }
    input.close();
  }
}
