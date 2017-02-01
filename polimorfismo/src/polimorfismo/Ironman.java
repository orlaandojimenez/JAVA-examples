
package polimorfismo;

public class Ironman extends SuperHeroe implements Volador{

    public int edad = 32;
    
    @Override
    public void volar() {
        System.out.println("Ironman volando");
    }
    
    public void correr(){
        System.out.println("Ironman corriendo");
    }
    
    public void lanzarLaser(){
        System.out.println("Ironman lanzando laser");
    }
    
}
