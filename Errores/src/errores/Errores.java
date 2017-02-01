package errores;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Errores {

    public static void main(String[] args) {
        //assert (0 == 1);

        Operaciones o1 = new Operaciones();
        o1.division(3, 0);

        int a = 4;
        int b = 0;
   // int c = a / b;
        //   System.out.println("c: " + c);

        try {
            Class.forName("algo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Errores.class.getName()).log(Level.SEVERE, null, ex);
        }
        Animal a1 = new Perro();
        Gato g1;
        
        try {
            g1 = (Gato)a1;
        } catch (ClassCastException) {
            System.err.println("Error de casteo");
        }
    }
}