
package igualdad;


public class Igualdad {

    
    public static void main(String[] args) {
            Alumno a1 = new Alumno(1554983, 25, "Ramiro");
            Alumno a2 = new Alumno(1554983, 25, "Ramiro");
            Alumno a3 = new Alumno(1551783, 20, "Laura");
            Alumno a4 = new Alumno(1576498, 27, "Mario");
            
            if (a1.equals(a2)) {
                System.out.println("Es verdadero");
        }
            else
                System.out.println("Es falso");
            
            if (a3.equals(a4)) {
                System.out.println("Es verdadero");
        }
            else
                System.out.println("Es falso");
    }
    
}
