package coleccionesdos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metodos {
    public void metodoUno(){
        List a1 = new ArrayList();
        a1.add("String X");
        a1.add(6);
        a1.add(4);
        a1.add(8);
        a1.add(3);
        a1.add(2);
        
        System.out.println(a1);
       
        int mayor = (int) Collections.max(a1); //Collections tiene metodosde colecciones
        Collections.sort(a1);
        /*for (Object a11 : a1) {
            int num = (int)a11;
            if (mayor < num) {
                mayor = num;
            }
        }*/
        System.out.println("El nnumero mayor es " + mayor);
        System.out.println(a1);
        Collections.reverse(a1);
        System.out.println(a1);
        Collections.shuffle(a1);
        System.out.println(a1);
        //los metodos mas importantes de collections son max, min, sort, reverse, shuffle, contains
    }
}
