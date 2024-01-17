package practica3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int tabla,resul;
        //variables
        System.out.print("Que tabla desea mostrar?");
        tabla = scanner.nextInt();
        System.out.println("----------------------------");
        System.out.println("mostrando la tabla de");
        System.out.println("---------------------------");
        //bucle
        for (int i = 1; i < 11 ; i++) {
            resul=tabla*i;
            System.out.println(tabla+ " x " + i + " = " + resul);       

        }
scanner.close();
    }
    
}
