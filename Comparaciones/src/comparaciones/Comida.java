package comparaciones;

public class Comida implements Comparable<Comida>{
    private String nombre;
    private double precio;
    private String color;

    public Comida(String nombre, double precio, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", precio=" + precio + ", color=" + color + '}';
    }
    //compareTo retorna un numero negativo si el objeto actual es menor
    //un numero positivo si el objeto actual es mayor 
    //un cero si son iguales
    /*@Override
    public int compareTo(Object o) {
        Comida c1 = (Comida)o;
        return (int) (this.getPrecio()-c1.getPrecio());
    }*/
    
     /*@Override
    public int compareTo(Object o) {
        Comida c1 = (Comida)o;
      return this.getNombre().compareTo(c1.getNombre());
    }*/
    
    /*@Override
    public int compareTo(Object o) {
        Comida c1 = (Comida)o;
        return this.getColor().compareTo(c1.getColor());
    }*/

    @Override
    public int compareTo(Comida o) {
        return (int) (o.getPrecio()-this.getPrecio());
    }
}
