
package polimorfismo;

public class Polimorfismo {

    
    public static void main(String[] args) {
       /*
        reglas del polimorfismo:
        1 la variable de la izquierda debe ser un padre del de la derecha
        2 se tomaran los atrubutos del de la izquierda
        3 se usaran los metodos del de la derecha siempre y cuando el de la izquierda tambien los tenga
                
        */
        
        Superman s1 = new Superman();
       Humano h1 = new Superman();
       Volador v1 = new Superman();
       SuperHeroe sh1 = new Ironman();
       
       
        System.out.println("Edad h1: " + h1.edad);
        h1.correr();
        //sp1.lanzarLaser(); error porque superheroe no tiene el metodo lanzarLaser
        System.out.println("--------------");
        
        int entero = 4;
        float flotante = 7.3F;
        System.out.println("Entero: " + entero);
        System.out.println("Flotante: " + flotante);
        
        entero = (int)flotante;
        System.out.println("Entero: " + entero);
        
        long a1 = 56;
        double a2 = 45.7;
        a2 = a1;
        
        System.out.println("----------------");
        
        SuperHeroe sh3 = (SuperHeroe)h1;
        Superman sm = (Superman)sh3;
        
        h1.correr();
        sh3.correr();
        sm.correr();
        
        sm.volar();
        
        SuperHeroe sh4 = new Ironman();
        
        //Superman clark = (Superman)sh4; no se castea a hermanos
    }
    
}
