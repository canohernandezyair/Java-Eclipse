package figuras; // Declaración del paquete

import java.util.*; // Importación de la clase Scanner

/**
 * La clase Circulo permite calcular el área de un círculo.
 * El usuario proporciona el radio del círculo, y el programa
 * calcula el área utilizando la fórmula: área = pi * radio^2.
 * 
 * Autor: Yair Cano Hernandez
 */
public class Circulo {

    /**
     * Método principal que solicita al usuario el radio del círculo,
     * calcula el área y muestra los resultados.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este programa).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Creación de un objeto Scanner

        // Mensaje de bienvenida y descripción del programa
        System.out.println("|--------- Área de un círculo ---------- |");
        System.out.println("| Descripción: Este programa en Java calcula el área de un círculo |");

        // Solicitar al usuario el radio del círculo
        System.out.print("| Por favor, introduce el radio del círculo:");
        double radio = s.nextDouble(); // Leer la entrada del usuario para el radio

        // Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Imprimir los detalles del círculo y su área
        System.out.println("|------------------------------------------|");
        System.out.println("| Radio del círculo: " + radio);
        System.out.println("|------------------------------------------|");
        System.out.println("| Mensaje Final: El área del círculo es " + area);
        System.out.println("|------------------------------------------|");

        s.close(); // Cerrar el Scanner
    }
}
