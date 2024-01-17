//
import java.util.Scanner;
public class Sumaproducto {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
int num1,num2,suma,producto;
System.out.print("ingrese primer numero:");
num1 =leer.nextInt();
System.out.print("ingrese segundo numero:");
num2 = leer.nextInt();
suma = leer.nextInt();
producto = num1 * num2;
System.out.print("Resultado de la suma es  " + suma);
System.out.print("Resultado de la multiplicacion es  " + producto);
    }

}