package figuras; // Declaración del paquete

import java.util.*; // Importación de la clase Scanner

/**
 * La clase Triangulo permite calcular el área de un triángulo.
 * El usuario proporciona la base y la altura del triángulo, y el programa
 * calcula el área utilizando la fórmula: área = (base * altura) / 2.
 * 
 * Autor: Yair Cano Hernandez
 */
public class Triangulo {

    /**
     * Método principal que solicita al usuario la base y la altura del triángulo,
     * calcula el área y muestra los resultados.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner

        // Mensaje de bienvenida y descripción del programa
        System.out.println("|--------- Área de un triángulo ---------- |");
        System.out.println("| Descripción: Este programa en Java calcula el área de un triángulo |");

        // Solicitar al usuario la base del triángulo
        System.out.print("| Por favor, introduce la longitud de la base del triángulo:");
        double base = s.nextDouble(); // Leer la entrada del usuario para la base

        // Solicitar al usuario la altura del triángulo
        System.out.print("Por favor, introduce la altura del triángulo:");
        double altura = s.nextDouble(); // Leer la entrada del usuario para la altura

        // Calcular el área del triángulo
        double area = (base * altura) / 2;

        // Imprimir los detalles del triángulo y su área
        System.out.println("|------------------------------------------|");
        System.out.println("| Base del triángulo: " + base);
        System.out.println("| Altura del triángulo: " + altura);
        System.out.println("|------------------------------------------|");
        System.out.println("| Mensaje Final: El área del triángulo es " + area);
        System.out.println("|------------------------------------------|");

        s.close(); // Cerrar el Scanner
    }
}
