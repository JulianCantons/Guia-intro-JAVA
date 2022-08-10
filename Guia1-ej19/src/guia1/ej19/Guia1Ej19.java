package guia1.ej19;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo
 * siguiente:
 */
public class Guia1Ej19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int numero = 0, i = 0, j = 0;

        dibujarCuadrado();
        System.out.println("-----FIN DEL PROGRAMA-----");
    }

    public static void dibujarCuadrado() {
        int numero;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero que desea");
        numero = sc.nextInt();
        
        //linea arriba
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
        
        for (int i = 0; i <numero -2; i++) {
            System.out.print("*");
            for (int j = 0; j <numero-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        //linea abajo
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        
        System.out.println(" ");
    }

}
