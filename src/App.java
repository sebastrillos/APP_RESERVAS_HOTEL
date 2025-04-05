import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir el polinomio (coeficientes) y el divisor
        System.out.println("Ingresa el grado del polinomio (por ejemplo, 3 para un polinomio de grado 3): ");
        int grado = scanner.nextInt();

        // Pedir al usuario que ingrese los coeficientes del polinomio
        int[] coeficientes = new int[grado + 1];
        System.out.println("Ingresa los coeficientes del polinomio (de mayor a menor grado): ");
        for (int i = 0; i <= grado; i++) {
            coeficientes[i] = scanner.nextInt();
        }

        // Pedir al usuario el valor de 'r' para la división por (x - r)
        System.out.println("Ingresa el valor de r (el valor del divisor x - r): ");
        int r = scanner.nextInt();

        // Realizar la división sintética
        int[] cociente = new int[grado];
        int residuo = coeficientes[0];

        System.out.println("\nRealizando la división sintética:");

        // Realizamos la división sintética
        cociente[0] = coeficientes[0];
        for (int i = 1; i <= grado; i++) {
            // Multiplicamos el valor anterior por 'r' y sumamos al coeficiente actual
            cociente[i - 1] = coeficientes[i] + r * cociente[i - 1];
        }

        residuo = cociente[grado - 1]; // El último valor en el cociente es el residuo

        // Mostrar el resultado
        System.out.println("El cociente es:");
        for (int i = 0; i < grado; i++) {
            System.out.print(cociente[i] + " ");
        }

        System.out.println("\nResiduo: " + residuo);
        scanner.close();



    }
}
