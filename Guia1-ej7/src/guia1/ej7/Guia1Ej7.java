
package guia1.ej7;

import java.util.Scanner;

public class Guia1Ej7 {
/**Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 *  
 */
  
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num1, num2;
    
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println("El primer numero :" + num1 + " es mayor");
        }else
            System.out.println("El segundo numero :" + num2 + " es mayor");
    
    
    
    }
    
}
