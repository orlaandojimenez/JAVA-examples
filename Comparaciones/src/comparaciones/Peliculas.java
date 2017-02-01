package comparaciones;

public class Peliculas {
    private String nombre;
    private String clasificacion;
    private int duracion;

    public Peliculas(String nombre, String clasificacion, int duracion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + ", duracion=" + duracion + '}';
    }
    // POJO plain Old Java Object
    
}
