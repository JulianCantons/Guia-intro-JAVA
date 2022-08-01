
package ClaseMain;
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla.

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        String nombreCompleto;
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        nombreCompleto = nombre + apellido;
        
        System.out.println("Su nombre completo  es :" +nombre +" "+apellido);
        
    }
    
}
