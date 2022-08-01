
package guia1.ej5;

import java.util.Scanner;

public class Guia1Ej5 {
//Dada una cantidad de grados centígrados se debe mostrar su 
//equivalente en grados Fahrenheit. La fórmula correspondiente
//es: F = 32 + (9 * C / 5).
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grados;
        
        System.out.println("Ingrese los grados centigrados a "
                + "calcular en Fahrenheit");
        grados = sc.nextDouble();
        
        double fahrenheit = 32 + (9 * grados / 5);
        System.out.println("grados centigrados :" + grados + ""
                + "a Fahrenheit es : " + fahrenheit);
        
        
    }
    
}
