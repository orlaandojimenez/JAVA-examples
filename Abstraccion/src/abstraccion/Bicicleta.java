package abstraccion;

public class Bicicleta extends Cosa{

    private double precio;
    private String marca;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public Bicicleta(String forma, String color, String material, String tamanio, String marca, double precio){
        super(forma, color, material, tamanio);
        this.marca = marca;
        this.precio = precio;
    }
    
    @Override
    public void existir() {
        System.out.println("la bicicleta existe");
    }

    @Override
    protected void romperse() {
        System.out.println("la bicicleta se rompe");
    }
    
    void andar(){
        System.out.println("la bicicleta anda");
    }
    
}
