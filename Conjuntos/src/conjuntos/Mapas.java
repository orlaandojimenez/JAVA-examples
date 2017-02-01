package conjuntos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapas {
    public void pruebaMapaUno(){
    Map m1 = new HashMap();
    m1.put("Uno", 7);
    m1.put("Dos", 8);
    m1.put("Tres", 2);
    m1.put("Cuatro", 43);
    m1.put("Tres", 7);
    
         System.out.println(m1.keySet());
        
       
        System.out.println(m1.get("Cuatro"));
        System.out.println(m1.values());
    }
}
