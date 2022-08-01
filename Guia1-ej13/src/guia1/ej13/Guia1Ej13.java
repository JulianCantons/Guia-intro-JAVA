
package guia1.ej13;

import java.util.Scanner;

/**
 * Escriba un programa que valide si una nota está entre 0 y 10,
 sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
 la nota sea correcta.
 * 
 */
public class Guia1Ej13 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;
    
    do {
        System.out.println("Ingrese una nota");
        nota = sc.nextInt();
            
        } while (nota>0 && nota >=11);
    }
    
}
