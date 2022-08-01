
package guia1.ej10;

import java.util.Scanner;

public class Guia1Ej10 {
/**Realizar un programa que solo permita introducir solo 
frases o palabras de 8 de largo. Si el usuario ingresa
una frase o palabra de 8 de largo se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario,
*se deberá imprimir “INCORRECTO”. Nota: investigar 
*la función Lenght() en Java.  
*/
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        String frase;
        
        System.out.println("Ingrese una frase o palabra"
                + " solo de 8 caracteres");
        frase = sc.nextLine();
        if (frase.length() ==8) {
            System.out.println("La frase es CORRECTA");
        }else {
            System.out.println("La frase es Incorrecta");
        }
        
        
    }
    
}
