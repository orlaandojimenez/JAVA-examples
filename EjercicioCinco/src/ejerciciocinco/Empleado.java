package ejerciciocinco;

public class Empleado {
    public String nombre;
    public String apellido;
    public int edad;
    public double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public void trabajar(){
        System.out.println("work hard");
    }
    
    public void descansar(){
        System.out.println("tirando hueva");
    }
    
    public void trabajar(String nombre){
        System.out.println(nombre + "le esta hechando huevos");
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
