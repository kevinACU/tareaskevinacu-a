package practica2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 int num1, num2;
 System.out.print("Diguite primee número ");
 num1 = scanner.nextInt();
 System.out.print("Diguite primee número ");
 num2 = scanner.nextInt();
//condicional
if (num1>num2) {
System.out.print("primer número es mayor");
}else if (num2>num1) {
  System.out.print("segundo número es mayor");  
}else{
System.out.print("Son iguales ");
}
scanner.close();
    }
 
}
