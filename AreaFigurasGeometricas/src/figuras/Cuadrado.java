package figuras; // Declaración del paquete

import java.util.*; // Importación de la clase Scanner

/**
 * La clase Cuadrado permite calcular el área de un cuadrado.
 * El usuario proporciona el lado del cuadrado, y el programa
 * calcula el área utilizando la fórmula: área = lado * lado.
 * 
 * Autor: Yair Cano Hernandez
 */
public class Cuadrado {

    /**
     * Método principal que solicita al usuario el lado del cuadrado,
     * calcula el área y muestra los resultados.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner

        // Mensaje de bienvenida y descripción del programa
        System.out.println("|--------- Área de un cuadrado ---------- |");
        System.out.println("| Descripción: Este programa en Java calcula el área de un cuadrado |");

        // Solicitar al usuario el lado del cuadrado
        System.out.print("| Por favor, introduce la longitud del lado del cuadrado:");
        double lado = s.nextDouble(); // Leer la entrada del usuario para el lado

        // Calcular el área del cuadrado
        double area = lado * lado;

        // Imprimir los detalles del cuadrado y su área
        System.out.println("|------------------------------------------|");
        System.out.println("| Lado del cuadrado: " + lado);
        System.out.println("|------------------------------------------|");
        System.out.println("| Mensaje Final: El área del cuadrado es " + area);
        System.out.println("|------------------------------------------|");

        s.close(); // Cerrar el Scanner
    }
}
