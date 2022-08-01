
package guia1.ej14;

import java.util.Scanner;

/**
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere
el límite inicial.
 */
public class Guia1Ej14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, numAux,cont;
        
        System.out.println("Ingrese el valor limite");
        num = sc.nextInt();
        cont = 0;
        do {
            System.out.println("Ingrese numeros hasta llegar al limite"
                    + " anterior");
            numAux = sc.nextInt();
            cont = cont + numAux;
            
        } while (cont < num);
        System.out.println("Fin del programa");
    }
    
}
