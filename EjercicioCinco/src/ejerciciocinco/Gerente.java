package ejerciciocinco;
public class Gerente extends Empleado{
    public int rango;
    public int nivelDeAcceso;
    
    public Gerente(String nombre, String apellido, double sueldo, int rango, int nivelDeAcceso){
        super(nombre, sueldo);
        this.apellido = apellido;
        this.rango = rango;
        this.nivelDeAcceso = nivelDeAcceso;
    }
    
    public Gerente(){
        this("Orlando", "Jimenez", 4000.50, 2, 3);
    }
    
   
    
    public void despedir(Empleado e){
        System.out.println("El gerente: " + this.nombre + " " + this.apellido + "" + " despidio al empleado: " + e ) ;
    }
    
    @Override
    public void trabajar(){
        System.out.println("el gerente esta trabajando");
    }
    
}
