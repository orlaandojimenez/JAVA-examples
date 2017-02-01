package polimorfismo;

public class Superman extends SuperHeroe implements Volador {

    public int edad = 27;
    
    @Override
    public void volar() {
        System.out.println("Superman volando");
    }

    @Override
    public void correr(){
        System.out.println("Superman corriendo");
    }
    
}
