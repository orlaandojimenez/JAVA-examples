package conjuntos;

import java.util.Objects;

public class Hombre {
    public String nombre;
    public int edad;

    public Hombre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.edad;
        return 7;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hombre other = (Hombre) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hombre{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

   
    
    

}
