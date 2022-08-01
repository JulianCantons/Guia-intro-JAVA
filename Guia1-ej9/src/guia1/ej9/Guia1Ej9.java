
package guia1.ej9;

import java.util.Scanner;

/**Crear un programa que pida una frase y si esa frase es igual a
“eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
public class Guia1Ej9 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       String frase;
       
        System.out.println("Ingrese la frase correcta");
        frase = sc.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("La frase es correcta");
        }else {
            System.out.println("La frase es incorrecta");
        }
        
        
    }
    
}
