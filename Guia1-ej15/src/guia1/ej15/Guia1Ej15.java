package guia1.ej15;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: MENU 1. Sumar 2. Restar 3.
 * Multiplicar 4. Dividir 5. Salir Elija opción: El usuario deberá elegir una
 * opción y el programa deberá mostrar el resultado por pantalla y luego volver
 * al menú. El programa deberá ejecutarse hasta que se elija la opción 5. Tener
 * en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 */
import java.util.Scanner;

public class Guia1Ej15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int num1, num2, resMenu, resultado;
        String respuesta;

        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();
       

        do {
            System.out.println("MENU:\n"
                    + "1-SUMAR\n"
                    + "2-RESTAR\n"
                    + "3-MULTIPLICAR\n"
                    + "4-DIVIDIR\n"
                    + "5-SALIR");
            
            resMenu = sc.nextInt();
            System.out.println("Eligio la opcion :" + resMenu);
            respuesta = "N";
            
            switch (resMenu) {
                case 1: 
                    System.out.println(num1+" + "+num2+" = "+(num1+num2));
                    
                    break;
                case 2:
                    System.out.println(num1+" - "+num2+" = "+(num1-num2));
                    
                    break;
                case 3:
                    System.out.println(num1+" * "+num2+" = "+(num1*num2));
                    
                    break;
                case 4:
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                    
                    break;
                case 5:
                    System.out.println("esta seguro que desea salir ??(S/N)");
                    respuesta =sc.next();
                    respuesta=respuesta.toLowerCase();
                    
                    
                    break;
                default:
                    throw new AssertionError();
                    
            }
        } while (respuesta.equals("n") ||resMenu != 5);

        System.out.println("-----FIN DEL PROGRAMA-----");
    }

}
