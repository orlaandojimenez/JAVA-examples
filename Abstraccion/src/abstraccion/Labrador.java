package abstraccion;

public class Labrador extends Perro{
    @Override
    public void comer(){
        System.out.println("Labrador comiendo");
    }
    
    @Override
    public void dormir(){
        System.out.println("Labrador durmiendo");
    }
}
