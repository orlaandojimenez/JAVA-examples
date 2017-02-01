
package errores2;

import java.util.Objects;

public class Gato {
    private String raza;
    private String color;
    private int edad;
    
    public Gato(String raza, String color, int edad){
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   @Override
   public boolean equals(Object o){
       if (o instanceof Gato) {
           Gato g1 = (Gato)o;
           return this.raza.equals(g1.getRaza()) && this.color.equals(g1.getColor());
       }
       return false;
   }

   
    
    
    
}
