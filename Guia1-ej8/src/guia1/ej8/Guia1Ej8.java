
package guia1.ej8;

import java.util.Scanner;


public class Guia1Ej8 {
//Crear un programa que dado un numero determine si es par o impar.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese el numero que desee");
        num = sc.nextInt();
        
        if (num % 2 ==0) {
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }
        
        
    }
    
}
