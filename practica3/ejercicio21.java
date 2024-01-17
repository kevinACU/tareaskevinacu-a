package practica3;
public class ejercicio21 {
    public static void main(String[] args) {
        //variables
        int tabla,resul;
       for (tabla = 1; tabla < 11 ; tabla ++) {
        //salida
        System.out.print("Que tabla desea mostrar?");
        System.out.println("----------------------------");
        System.out.println("mostrando la tabla del" + tabla);
        System.out.println("---------------------------");
        //bucle
        for (int i = 1; i < 11 ; i++) {
            resul=tabla*i;
            System.out.println(tabla+ " x " + i + " = " + resul);       

        }
        }
    }
}
