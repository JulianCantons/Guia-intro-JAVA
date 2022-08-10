package guia1.ej20;

import java.util.Scanner;

public class Guia1Ej20 {

    /**
     * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
     * imprima el número ingresado seguido de tantos asteriscos como indique su
     * valor. Por ejemplo: 5 ***** 3 *** 11 *********** 2 **
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;
        
        num1=cargarNumero();
        num2=cargarNumero();
        num3=cargarNumero();
        num4=cargarNumero();
        
        imprimir(num1);
        imprimir(num2);
        imprimir(num3);
        imprimir(num4);
        
        System.out.println("-----FIN DEL PROGRAMA-----");

    }

    public static Integer cargarNumero() {
        int num1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese el numero que desea");
            num1 = sc.nextInt();
        } while (num1 < 1 || num1 > 20);
        return num1;
    }
    
    public static void imprimir(int numeroIngresado){
        System.out.print(numeroIngresado + " ");
        for (int i = 0; i < numeroIngresado; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }

}
