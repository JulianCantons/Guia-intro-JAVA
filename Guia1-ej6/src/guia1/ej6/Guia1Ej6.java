
package guia1.ej6;

import java.util.Scanner;

public class Guia1Ej6 {
/**Escribir un programa que lea un número entero por teclado y muestre por
pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función
Math.sqrt().
 
 */
  
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in).useDelimiter("\n");
     int num, doble, triple;
     double raizCuadrada;
     
        System.out.println("Ingrese el numero que desee calcular");
        num = sc.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raizCuadrada = Math.sqrt(num);
     
        System.out.print("el doble del numero ingresado es :"
                + doble + "el triple del numero ingresado"
                + "es : "+ triple + "la raiz cuadrada"
                + "del numero ingresado es :"
                + raizCuadrada);

     
    }
    
}
