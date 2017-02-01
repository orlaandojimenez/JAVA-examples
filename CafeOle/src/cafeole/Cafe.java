package cafeole;

public class Cafe {

    public String tamanio;
    public String sabor;
    public String preparacion;
    public double precio;
    public String observaciones;
    
    
   public Cafe(String tamanio, double precio){
       this.tamanio = tamanio;
       this.precio = precio;
   }
   
   public Cafe(){
       this.sabor = "tradicional";
   }
   
   public Cafe(String observaciones){
       this.observaciones = observaciones;
   }
   
   public void orden(){
       System.out.println("Ordenando");
   }
   
   public void entrega(){
       System.out.println("Ay vaa");
   }
   
   public void recibido(){
       System.out.println("Gracias compi");
   } 
}
