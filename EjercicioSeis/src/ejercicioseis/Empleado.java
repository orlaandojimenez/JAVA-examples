package ejercicioseis;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private double sueldo;
    
     public Empleado(String nombre, String apellido, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    public void trabajar(){
        System.out.println("El empleado esta trabajando");
    }
    
    public String trabajar(String nombre){
        return("El empleado" + nombre + " esta trabajando");
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
