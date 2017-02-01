package phonecity;

public class Celular {

    public String modelo;
    public String marca;
    public String color;
    public String telefonica;
    public String so;
    public double precio;
    
    
    public Celular(String marca, String modelo){
        this.modelo = modelo;
        this.marca = marca;
       
    }
    /*public Celular(String modelo){
        this.modelo = modelo;
    }*/
    
    public Celular(String marca){
        this.marca = marca;
    }
    
    public Celular(double precio){
        this.precio = precio;
    }
    
    public Celular(){
        this.marca = "marca propia";
    }
    
    public void marcar(){
        System.out.println("Llamando riiing ring");
    }
    
    public void contestando(){
        System.out.println("Bueno?");
    }
    
    public void timbrando(){
        System.out.println("ring ring ring");
    }
    
    public void timbrando(String amiga){
        System.out.println("ring ring ring" + amiga);
    }
}
