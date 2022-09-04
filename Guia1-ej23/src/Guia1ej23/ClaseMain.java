package Guia1ej23;


import java.util.Scanner;

public class ClaseMain {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores
     * aleatorios y le pida al usuario un numero a buscar en el vector. El
     * programa mostrará donde se encuentra el numero y si se encuentra repetido
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int n =0;
        

        System.out.println("Ingrese el valor del vector");
        n = sc.nextInt();
        
        int vector[] = new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Ingrese los numeros que desee");
            vector[i] = sc.nextInt();
        }
        
        int buscar =0;
        System.out.println("Ingrese el numero que desea buscar");
        buscar = sc.nextInt();
        
        int cont =0;
        
        for (int i = 0; i < n; i++) {
            if (cont == buscar) {
                cont++;
            }
            
        }
        System.out.println("El numero a buscar se repitio"
                + buscar + " de veces");
    }

}
