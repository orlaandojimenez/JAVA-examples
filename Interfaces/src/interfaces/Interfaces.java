
package interfaces;

public class Interfaces {

    
    public static void main(String[] args) {
        Pajaro pa1 = new Pajaro();
        Pez pe1 = new Pez();
        if (pa1 instanceof Volador) {
            System.out.println("pa1 instanceof Volador");
        }
        if (pa1 instanceof SuperVolador) {
            System.out.println("pa1 instanceof SuperVolador");
        }
        if (pa1 instanceof Nadador) {
            System.out.println("pa1 instanceof Nadador");
        }
        
        pa1.aterrizar();
        pa1.comer();
        pa1.dormir();
        
        System.out.println(Volador.a1);
    }
    
}
