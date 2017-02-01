package EjemploHilos;

public class EjemploHilos {
    public static void main(String[] args) {
        Runnable hilo = new Hilo();
        Thread hilo1 = new Thread(hilo);
        Thread hilo2 = new Thread(hilo);
        Thread hilo3 = new Thread(hilo);
        
        hilo1.setName("***Hilo 1***");
        hilo2.setName("---Hilo 2---");
        hilo3.setName("°°°Hilo 3°°°");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
                
    }
    
}
