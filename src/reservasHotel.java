
import java.util.Scanner;

public class reservasHotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bienvenido a la app de gestion de reservas. ");
        System.out.print("ingrese el numero de clientes maximo 10:  ");
        int numeroClientes = input.nextInt();
        System.out.println("A continucion dijite los datos requeridos:");

        int[][] libres = {
            {101, 102, 103, 104, 105},
            {201, 202, 203, 204, 205}
        };
         int longitud = libres.length;
        int[][] ocupadas = new int[2][5];
        String[] usuarios = new String[9];
        int[] precios = new int[10];
        int[] habitaciones = new int[10];
       for (int i = 0; i < numeroClientes; i++) {
                System.out.println("nuevo usuario");
                System.out.print("ingrese su nombre: ");
                String usuario = input.next();
                usuarios[i] = usuario ;
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuario = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
             for (int k = 0; k < longitud; k++) {
                 for (int j = 0; j < libres[k].length; j++) {
                    System.out.print(libres[k][j] + " "); 
                 }
                 System.out.println();
             }
             System.out.print("Cual habitacion eligio: ");
            int habitacionUsuario = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int presioHavitacion = input.nextInt();
             for (int h = 0; h < longitud; h++) {
                 for (int m = 0; m < libres[h].length; m++) {
                    if (libres[h][m] == habitacionUsuario) { 
                            System.out.println("¿desea canselar la reserva?");
                            System.out.println("1) si.");
                            System.out.println("2) No.");
                            byte cancelar = input.nextByte();
                            if (cancelar==2) {
                                ocupadas[h][m] = libres[h][m];
                                libres[h][m] = 0;
                            }
                    } 
                 }
                 for (int y = 0; y < habitaciones.length; y++) {
                    habitaciones[y] = habitacionUsuario;
                     
                 }
             }
          
            int presio = presioHavitacion * nochesUsuario;
            precios[i] = presio;
            
            
        }
        for (int l = 0; l < numeroClientes ; l++) {
                System.out.println();
                System.out.println("Cliente: " + (l + 1) + " - nombre -  " + usuarios[l] + " - habitacion - " + habitaciones[l] + " - Total a pagar - " + precios[l] );    
            
        }
        System.out.println();
        System.out.println("Habitaciones que estan disponibles son: ");
        for (int f = 0; f < longitud; f++) {
            for (int s = 0; s < libres[f].length; s++) {
                
                System.out.println(libres[f][s]);
            }
            System.out.println();
        }
        System.out.println();
            System.out.println("Habitaciones que estan ocupadas son: ");
        
        for (int v = 0; v < longitud; v++) {
            for (int p = 0; p < ocupadas[v].length; p++) {
                
               System.out.println(ocupadas[v][p]);
            }
            System.out.println();
        }
        input.close();
   }
}

