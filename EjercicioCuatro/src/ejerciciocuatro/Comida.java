package ejerciciocuatro;

public class Comida {
    String ingredientes[];
    public String sabor;
    public double precio;
    
    public void preparar(){
        System.out.println("Preparando comida");
    }
    
    public String sevir(){
        return("Comida servida");
    }
}
