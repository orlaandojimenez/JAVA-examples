package ejercicioseis;

public class Ingeniero extends Empleado implements Despedidor{
    
    private int nivelDeAcceso;
    
     public Ingeniero(String nombre, String apellido, double sueldo, int nivelDeAcceso){
        super(nombre, apellido, sueldo);
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public int getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    public void setNivelDeAcceso(int nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }
    
   
    
    public void inventar(){
        System.out.println("Ingeniero inventando");
    }
    

   
    @Override
    public String trabajar(String nombre) {
        return("El ingeniero " + nombre + " esta trabajando");    }

    @Override
    public void despedir(Empleado e) {
        System.out.println("El ingeniero despidio al empleado " + e);
    }
    
}
