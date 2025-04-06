
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
        int[] ocupadas = new int[10];
       for (int i = 0; i < numeroClientes; i++) {
        switch (i) {
            case 0 -> {
                System.out.println("primer usuario");
                System.out.print("ingrese su nombre: ");
                String primerUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioUno = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                    System.out.print(libres1[j] + ", ");
                }
                System.out.println();
                
            }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioUno = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioUnoPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioUno) {
                       ocupadas[1] = libres[i][j];
                       libres[i][j] = 0;
                       
                   }
                }
            }
                }
                
            case 1 -> {
                System.out.println("segundo usuario");
                System.out.print("ingrese su nombre: ");
                String segundoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioDos = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioDos = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioDosPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioDos) {
                       ocupadas[2] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 2 -> {
                System.out.println("tercer usuario");
                System.out.print("ingrese su nombre: ");
                String tercerUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioTres = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioTres = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioTresPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioTres) {
                       ocupadas[3] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 3 -> {
                System.out.println("cuarto usuario");
                System.out.print("ingrese su nombre: ");
                String cuartoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioCuatro = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioCuatro = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioCuatroPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioCuatro) {
                       ocupadas[4] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 4 -> {
                System.out.println("quinto usuario");
                System.out.print("ingrese su nombre: ");
                String quintoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioCinco = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioCinco = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioCincoPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioCinco) {
                       ocupadas[5] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 5 -> {
                System.out.println("sexto usuario");
                System.out.print("ingrese su nombre: ");
                String sextoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioSeis = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioSeis = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioSeisPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioSeis) {
                       ocupadas[6] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 6 -> {
                System.out.println("septimo usuario");
                System.out.print("ingrese su nombre: ");
                String septimoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioSiete = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioSiete = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioSietePresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioSiete) {
                       ocupadas[7] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 7 -> {
                System.out.println("octavo usuario");
                System.out.print("ingrese su nombre: ");
                String octavoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioOcho = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioOcho = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioOchoPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioOcho) {
                       ocupadas[8] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 8 -> {
                System.out.println("noveno usuario");
                System.out.print("ingrese su nombre: ");
                String novenoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioNueve = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioNueve = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioNuevePresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioNueve) {
                       ocupadas[9] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            case 9 -> {
                System.out.println("decimo usuario");
                System.out.print("ingrese su nombre: ");
                String decimoUsuario = input.next();
                System.out.print("numero de noches que se desea hospedar en el hotel: ");
                int nochesUsuarioDiez = input.nextInt();
                System.out.println("Las habitaciones disponibles son: ");
                for (int[] libres1 : libres) {
                    for (int j = 0; j < libres1.length; j++) {
                        System.out.print(libres1[j] + ", ");
                    }
                    System.out.println();
                }
            System.out.print("Cual habitacion eligio: ");
            int habitacionUsuarioDiez = input.nextInt();
            System.out.print("ingrese el presio de la habitacion por cada noche:  ");
            int habitacionUsuarioDiezPresio = input.nextInt();
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                   if (libres[i][j] == habitacionUsuarioDiez) {
                       ocupadas[10] = libres[i][j];
                       libres[i][j] = 0;
                   }
                }
            }
                }
            default -> System.out.println("¡Numero de usarios sobre capasidad de sistema!");
        }   
        
        
       }
       System.out.println("habitaciones ocupadas: ");
        
            for (int k = 0; k < ocupadas.length; k++) {
                System.out.print(ocupadas[k] + ", ");
            }
            System.out.println();
            System.out.println("habitaciones disponibles: ");
            for (int[] libres1 : libres) {
                for (int j = 0; j < libres1.length; j++) {
                    System.out.print(libres1[j] + ", ");
                }
                System.out.println();
            }
   }
 }
