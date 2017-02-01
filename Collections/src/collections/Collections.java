
package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Collections {

   
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.println("Ingrese el nombre de los alumnos");
        ArrayList lista1 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String cadena = n.next();
            lista1.add(i);
            lista1.add(cadena);
        }
        System.out.println("------------");
        ArrayList lista2 =  lista1;
        for (int i = 0; i < 5; i++) {
            String cadena = n.next();
            lista2.add(i);
            lista2.add(cadena);
        }
        
        //Recorrer lista
        Iterator j = lista1.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
    }
    }
    
}
