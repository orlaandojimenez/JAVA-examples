package herencia;

public class Chihuahua extends Perro {
    public String nerviosismo;

    public Chihuahua(String color, String especie, int edad, String pelo) {
        super(color, especie, edad, pelo);
    }

    public Chihuahua(String nerviosismo, String color, String especie, int edad, String pelo) {
        super(color, especie, edad, pelo);
        this.nerviosismo = nerviosismo;
    }
    
    
    
    
}
