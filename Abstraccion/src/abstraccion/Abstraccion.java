
package abstraccion;

public class Abstraccion {

    
    public static void main(String[] args) {
       /*Perro p1 = new Perro();
       p1.comer();
       p1.dormir();*/
        Husky h1 = new Husky();
        h1.comer();
        h1.dormir();
        
        System.out.println("-------");
        
        Bicicleta b1 = new Bicicleta("forma de bicicleta "," azul "," metal ", " grande ", " apache ", 50 );
        System.out.println(b1);
    }
    
}
