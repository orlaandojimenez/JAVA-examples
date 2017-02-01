
package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Colecciones {

    
    public static void main(String[] args) {
       String[] arreglo = new String[5];
       
       List c1 = new ArrayList();
       c1.add("uno");
       c1.add("dos");
       c1.add("tres");
       c1.add("cuatro");
       c1.add(5);
       c1.add(2, "Ultimo");
       c1.add(2, "Ultimo");
       
        System.out.println("Tamaño de ArrayList: " + c1.size());
        for (int i = 0; i < c1.size(); i++) {
            System.out.print(c1.get(i) + " ");
        }
        
        System.out.println("---------------");
        
        for (Iterator i = c1.iterator(); i.hasNext();) {
            System.out.print(i.next() + " ");
        }
        
        for (Object c11 : c1) {
            System.out.println(c11);
        }
       
        //System.out.println(c1.get(73));
    }
    
}
