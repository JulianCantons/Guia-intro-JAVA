
package ClaseMain;

import java.util.Scanner;

public class MainClass {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = sc.nextLine();
        
        System.out.println("su frase en minuscula es :" + frase.toLowerCase());
        
        System.out.println("su frase en mayuscula es :" + frase.toUpperCase());
    }
    
}
