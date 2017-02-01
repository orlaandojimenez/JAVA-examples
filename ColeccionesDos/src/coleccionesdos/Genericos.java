package coleccionesdos;

import java.util.Set;
import java.util.TreeSet;

public class Genericos {
    public void metodoGenerico(){//<> operadr diamante
        //dentro del operador diamante no se ponen variables primitivas, solo clases
//? es un wildcard, cuando se usa super en genericos se podran meter objetos de la clse siguiente y sus hijos
//cuando se usa extends no se podran agregar objetos a la coleccion, sol se podran leer
        Set< Integer> s1 = new TreeSet<>(); 
        //s1.add("Chat spam Kappa");                 
        s1.add(420);                                 
    }
}
