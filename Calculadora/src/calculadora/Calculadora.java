package calculadora; // Declaración del paquete

import java.util.*; // Importación de la clase Scanner

/**
 * La clase Calculadora implementa una calculadora básica en Java
 * que permite al usuario realizar operaciones matemáticas simples.
 * 
 * Autor: Yair Cano Hernandez
 */
public class Calculadora {

    /**
     * Método principal que muestra un menú de opciones al usuario
     * para seleccionar la operación deseada, solicita dos números
     * y muestra el resultado de la operación elegida.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creación de un objeto Scanner

        // Mensaje de bienvenida y descripción del programa
        System.out.println("|--------- Calculadora Básica ---------- |");
        System.out.println("| Descripción: Esta calculadora realiza operaciones básicas |");

        // Mostrar menú de opciones
        System.out.println("|------------------------------------------|");
        System.out.println("| Opciones:                               |");
        System.out.println("| 1. Suma                                 |");
        System.out.println("| 2. Resta                                |");
        System.out.println("| 3. Multiplicación                       |");
        System.out.println("| 4. División                             |");
        System.out.println("|------------------------------------------|");
        System.out.print("| Elija una opción (1-4): ");

        int opcion = scanner.nextInt(); // Leer la opción seleccionada

        // Solicitar dos números al usuario
        System.out.print("| Por favor, introduzca el primer número: ");
        double numero1 = scanner.nextDouble(); // Leer el primer número
        System.out.print("| Por favor, introduzca el segundo número: ");
        double numero2 = scanner.nextDouble(); // Leer el segundo número

        double resultado = 0; // Variable para almacenar el resultado de la operación

        // Realizar la operación seleccionada
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2; // Suma
                break;
            case 2:
                resultado = numero1 - numero2; // Resta
                break;
            case 3:
                resultado = numero1 * numero2; // Multiplicación
                break;
            case 4:
                // Verificar si el segundo número es diferente de cero para evitar división por cero
                if (numero2 != 0) {
                    resultado = numero1 / numero2; // División
                } else {
                    System.out.println("| Error: No se puede dividir por cero.");
                    return; // Salir del programa si se intenta dividir por cero
                }
                break;
            default:
                System.out.println("| Error: Opción no válida.");
                return; // Salir del programa si la opción no es válida
        }

        // Imprimir el resultado de la operación
        System.out.println("|------------------------------------------|");
        System.out.println("| Resultado: " + resultado);
        System.out.println("|------------------------------------------|");

        scanner.close(); // Cerrar el Scanner
    }
}
