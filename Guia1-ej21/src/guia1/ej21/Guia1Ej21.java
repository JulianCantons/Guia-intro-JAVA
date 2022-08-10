package guia1.ej21;

import java.util.Scanner;

public class Guia1Ej21 {

    /**
* Crea una aplicación que a través de una función nos convierta una
* cantidad de euros introducida por teclado a otra moneda, estas pueden ser
* a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
* de euros y la moneda a converir que será una cadena, este no devolverá
* ningún valor y mostrará un mensaje indicando el cambio (void). El cambio
* de divisas es: 0.86 libras es un 1 € 
* 1.28611 $ es un 1 € 
* 129.852 yenes es un 1 €
*/
    public static void main(String[] args) {

        FuncionCalcular();
        
    }

    public static void FuncionCalcular() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de diner"
                + "que desea calcular");
       double cantidadDinero = sc.nextInt();
       
       double libras = cantidadDinero * 0.86;
        System.out.println("La cantidad ingresada en libras es =" + libras);
        
        double pesos = cantidadDinero * 1.286;
        System.out.println("La cantidad ingresada en pesos es =" + pesos);
        
        double yenes = cantidadDinero * 129.852;
        System.out.println("La cantidad ingresada en yenes es =" + yenes);
        
    }

}
