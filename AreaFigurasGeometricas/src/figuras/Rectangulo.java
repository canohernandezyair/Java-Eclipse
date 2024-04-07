package figuras; // Declaración del paquete

import java.util.*; // Importación de la clase Scanner

/**
 * La clase Rectangulo permite calcular el área de un rectángulo.
 * El usuario proporciona la longitud y la altura del rectángulo, y el programa
 * calcula el área utilizando la fórmula: área = longitud * altura.
 * 
 * Autor: Yair Cano Hernandez
 */
public class Rectangulo {

    /**
     * Método principal que solicita al usuario la longitud y la altura del rectángulo,
     * calcula el área y muestra los resultados.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner

        // Mensaje de bienvenida y descripción del programa
        System.out.println("|--------- Área de un rectángulo ---------- |");
        System.out.println("| Descripción: Este programa en Java calcula el área de un rectángulo |");

        // Solicitar al usuario la longitud del rectángulo
        System.out.print("| Por favor, introduce la longitud del rectángulo:");
        double longitud = s.nextDouble(); // Leer la entrada del usuario para la longitud

        // Solicitar al usuario la altura del rectángulo
        System.out.print("Por favor, introduce la altura del rectángulo:");
        double altura = s.nextDouble(); // Leer la entrada del usuario para la altura

        // Calcular el área del rectángulo
        double area = longitud * altura;

        // Imprimir los detalles del rectángulo y su área
        System.out.println("|------------------------------------------|");
        System.out.println("| Longitud del rectángulo: " + longitud);
        System.out.println("| Altura del rectángulo: " + altura);
        System.out.println("|------------------------------------------|");
        System.out.println("| Mensaje Final: El área del rectángulo es " + area);
        System.out.println("|------------------------------------------|");

        s.close(); // Cerrar el Scanner
    }
}
