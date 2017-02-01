package encapsulamiento;

import modelos.Persona;


public class Encapsulamiento {

    
    public static void main(String[] args) {
       Persona p1 = new Persona();
       //p1.nombre = "Jose";
       //p1.apellido = "Hernandez";
       //p1.peso = 68;
       //p1.estatura = 1.70;
       
       p1.setNombre("Orlando");
       p1.setApellido("Jimenez");
       p1.setEdad(200);
       p1.setEdad(19);
       p1.setEstatura(1.70);
       p1.setPeso(60);
        System.out.println("Nombre: " + p1.getNombre() + "\nApellido: " + p1.getApellido() +" \nEdad: " + p1.getEdad() + "\nEstatura: " + p1.getEstatura() + "\nPeso: " + p1.getPeso());
    }
    
}
