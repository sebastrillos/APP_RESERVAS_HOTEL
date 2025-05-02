
import java.util.Scanner;

public class reservasHotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la app de gestión de reservas.");
        System.out.print("Ingrese el número de clientes (máximo 10): ");
        int numeroClientes = input.nextInt();
        System.out.println("A continuación, digite los datos requeridos:");

        int[][] libres = {
            {101, 102, 103, 104, 105},
            {201, 202, 203, 204, 205}
        };
        int filas = libres.length;
        int[][] ocupadas = new int[2][5];
        String[] usuarios = new String[10];
        int[] precios = new int[10];
        int[] habitaciones = new int[10];

        for (int i = 0; i < numeroClientes; i++) {
            System.out.println("Nuevo usuario:");
            System.out.print("Ingrese su nombre: ");
            String usuario = input.next();
            usuarios[i] = usuario;

            System.out.print("Número de noches que desea hospedarse: ");
            int nochesUsuario = input.nextInt();

            System.out.println("Las habitaciones disponibles son: ");
            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < libres[f].length; c++) {
                    if (libres[f][c] != 0) {
                        System.out.print(libres[f][c] + " ");
                    }
                }
                System.out.println();
            }

            System.out.print("¿Qué habitación eligió?: ");
            int habitacionUsuario = input.nextInt();

            System.out.print("Ingrese el precio por noche: ");
            int precioHabitacion = input.nextInt();

            for (int f = 0; f < filas; f++) {
                for (int c = 0; c < libres[f].length; c++) {
                    if (libres[f][c] == habitacionUsuario) {
                        System.out.println("¿Desea cancelar la reserva?");
                        System.out.println("1) Sí.");
                        System.out.println("2) No.");
                        byte cancelar = input.nextByte();

                        if (cancelar == 2) {
                            ocupadas[f][c] = libres[f][c];
                            libres[f][c] = 0;
                            habitaciones[i] = habitacionUsuario;
                            precios[i] = precioHabitacion * nochesUsuario;
                        } else {
                            habitaciones[i] = 0;
                            precios[i] = 0;
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Resumen de clientes con reserva:");
        System.out.println();
        for (int i = 0; i < numeroClientes; i++) {
            if (habitaciones[i] != 0) {
                System.out.println("Cliente " + (i + 1) + " - Nombre: " + usuarios[i] +
                    " - Habitación: " + habitaciones[i] + " - Total a pagar: " + precios[i]);
            }
        }

        System.out.println();
        System.out.println("Habitaciones disponibles:");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < libres[f].length; c++) {
               if (libres[f][c] != 0) {
                System.out.print(libres[f][c] + " ");
               }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Habitaciones ocupadas:");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < ocupadas[f].length; c++) {
                if (ocupadas[f][c] != 0) {
                    System.out.print(ocupadas[f][c] + " ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}
