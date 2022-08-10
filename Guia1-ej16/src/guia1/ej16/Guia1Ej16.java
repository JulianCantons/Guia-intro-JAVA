package guia1.ej16;

import java.util.Scanner;

/**
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
 * programa deberá calcular y mostrar el resultado de la suma de los números
 * leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
 * de la sentencia break.
 */
public class Guia1Ej16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numIngresado = 0, acumulador = 0, contador = 0;
        do {

            System.out.println("Ingrese un numero");
            numIngresado = sc.nextInt();
            if (numIngresado > 0) {
                acumulador = acumulador + numIngresado;
                contador++;
            }
        }while(numIngresado != 0 && contador <= 20);
        System.out.println("Se capturo el numero ´0´ ");
        System.out.println("La suma de los numeros acumulados"
                + "es :" + acumulador);
    }

}
