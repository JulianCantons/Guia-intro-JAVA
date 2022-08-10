package guia1.ej17;

import java.util.Scanner;

public class Guia1Ej17 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
     * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de
     * 5 caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O. Las secuencias leídas que respeten el formato se
     * consideran correctas, la secuencia especial “&&&&&” marca el final de los
     * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete
     * el formato se considera incorrecta. Al finalizar el proceso, se imprime
     * un informe indicando la cantidad de lecturas correctas e incorrectas
     * recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
     * las siguientes funciones de Java Substring(), Length(),equals().
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadenaIngresada = null;
        int lecturasCorrectas = 0, lecturasIncorrectas = 0;

        do {
            System.out.println("Ingrese la cadenea que desee");
            cadenaIngresada = sc.nextLine();
            if (cadenaIngresada.length() <= 5 && "x".equals(cadenaIngresada.substring(0,1))
                    && "o".equals(cadenaIngresada.substring(cadenaIngresada.length()-1))) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }

        } while (!"&&&&&".equals(cadenaIngresada));

        System.out.println("El numero de cadenas correctas es :" + lecturasCorrectas);
        System.out.println("El numero de cadenas incorrectas es :" + lecturasIncorrectas);
        System.out.println("-----FIN DEL PROGRAMA-----");
    }
}
