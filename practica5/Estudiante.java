public class Estudiante extends Persona {
private int creditos;
public Estudiante(String nombre, int edad) {
super (nombre, edad) ;
this.creditos = 60;
}
public int getcreditos()
 {return this.creditos;}
 public void mostardatos(){
    super.mostardatos();
    System.out.println("Estudiante matriculado de " + creditos + "creditos");
 }
}
