package guia1.ej18bis;

import static java.util.Arrays.equals;
import java.util.Scanner;

public class Guia1Ej18bis {

    /**
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 . . 0-1-2
     */
    public static void main(String[] args) {
        int numeroI = 10, numeroJ = 10, numeroK = 10;
        //String.valueOf(numEntero)

        do {
            for (Integer i = 0; i < numeroI; i++) {
                for (int j = 0; j < numeroJ; j++) {
                    for (int k = 0; k < numeroK; k++) {
                        
                    }
                }
                
            }
            System.out.println(numeroI);
            System.out.println(numeroJ);
            System.out.println(numeroK);
        } while (numeroI < 11 && numeroJ < 11 && numeroK < 11);
    }

}
