package Guia1ej22;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 */
public class ClaseMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int vector[] = new int[100];
        
        for (int i = vector.length; i >=1; i--) {
            System.out.println(i);
            
        }

    }

}
