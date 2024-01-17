package practica2;

import java.util.Scanner;

public class ejercicio3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracter;
        System.out.println("Programa Java Condicional String");
        System.out.println("Tipee un caracter");
        caracter = scanner.nextLine();
        if (caracter.length() !=1) {
            System.out.println("El caracter no existe");
            
        }else if ((caracter.compareTo("A") >=0) && (caracter.compareTo("Z")<=0)) {
              System.out.println("El caracter es una mayúscula!");

        }else{
        System.out.println("El caracter no es una mayúscula!");
        }
    }
}
