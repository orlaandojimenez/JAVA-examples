package ejerciciouno;

public class Perro {

    //Atributos de la clase Perro

    public String color;
    public String raza;
    public String tamanio;
    public int edad;
    public String nombre;
    //comentario una linea
    /*
     comentario varias lineas
     se declara primero el acceso a la variable
     el tipo de variable
     nombre que se le va a asignar a la variable
     */

    /*
     primero el acceso al metodo
     segundo el tipo de retorno del metodo
     tercero nombre del metodo con parentesis
     cuarto opcional parametros dentro del parentesis
     */
    public void ladrar() {
        System.out.println("El perro " + this.nombre + " ladra asi:" + " woof woof");
    }
}
