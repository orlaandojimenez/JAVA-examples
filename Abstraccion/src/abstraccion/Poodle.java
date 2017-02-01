package abstraccion;

public class Poodle extends Perro{

    @Override
    public void comer(){
        System.out.println("Poodle comiendo");
    }
    
    @Override
    public void dormir(){
        System.out.println("Poodle durmiendo");
    }
}
