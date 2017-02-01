package conjuntos;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class MisConjuntos {

    public void pruebaSetUno(){
        Set s1 = new HashSet();
        s1.add("Andres");
        s1.add("Francisco"); 
        s1.add("Berny");
        s1.add("Said");
        s1.add("Pepsi");
        s1.add("Said");
        
        Hombre h1 = new Hombre("Orlando", 20);
        Hombre h2 = new Hombre("Orlando", 42);
        
        s1.add(h1);
        s1.add(h2);
      
        
        for (Object s11 : s1) {
            System.out.println(s11);
        }
        
        /*
        Los set no pueden contener elementos iguales
        un eleento es igual cuando los metodos equals retornen true y el metodo hashcode retorne el msmo entero
        set no son repetdos ni estn ordenados
        */
    }
    
    public void pruebaSetDos(){
        Set s1 = new LinkedHashSet();
        s1.add(420);
        s1.add(200);
        s1.add(98);
        s1.add(200);
        s1.add(432);
        s1.add(65);
        
        for (Object s11 : s1) {
            System.out.println(s11);
        }
        /*
        cuando las colecciones tengan linked los mantiene en orden de entrada
        */
    }
    
    public void pruebaSetTres(){
        Set s1 = new TreeSet();
       // s1.add("ORlando");
        s1.add(70);
        s1.add(54);
        s1.add(21);
        s1.add(70);
        s1.add(50);
        
        for (Object s11 : s1) {
            System.out.println(s11);
            /*
            cuando tenga la palabta tree se mantienen en orden natural(menor a mayor)
            si tiene tipos que no sabe como ordear lanzara una excepcion
            */
        }
    }
}
