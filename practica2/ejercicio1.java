package practica2;

import java.util.Scanner;

public class ejercicio1 {
    static String red = "\03[31m";
    static String green = "\03[32m";
    static String reset = "\u0018[0m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variable
        float ingresos;
        float irp= 80000000;
        //entrada
        System.out.println(reset + "ingrese el ingreso anual:");
        ingresos = scanner.nextFloat();
        //condicion
        if (ingresos> irp) {
            System.out.println(red + "Debe abonar IRP el siguiente año.");
        }else{
            System.out.println(green + "No abona IRP");
        }
        scanner.close();
        System.out.println(reset);
    }
}
