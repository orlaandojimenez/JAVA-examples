package coleccionesdos;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public void colaDePrioridad(){
        Queue q1 = new PriorityQueue();
        q1.add("Uno");
        q1.add("Dos");
        q1.add("Tres");
        q1.add("Cuatro");
        q1.add("Cinco");
        
        System.out.println(q1);
        
        System.out.println(q1.peek()); //peek te retorna el primero
        
        System.out.println(q1);
        
        System.out.println(q1.poll()); //poll te retorna el primero y ademas lo quitade la cola
        
        System.out.println(q1);
        
        System.out.println(q1.poll());
        
        System.out.println(q1);
        
        System.out.println(q1.element()); //element es iigual a peek
        
        System.out.println(q1);
        
        System.out.println(q1.offer("Seis")); //es igual a add
        
        System.out.println(q1);
        
        System.out.println(q1.remove()); //es igual a poll
        
        System.out.println(q1);
        
        System.out.println(q1.remove("Uno")); //con parametro elimina el elemento que le pases
        
        System.out.println(q1);
        
        q1.clear();
        
        System.out.println(q1);
        
        for (Object q11 : q1) {
          //  System.out.println(q11);
        }
    }
    
    public void colaDePrioridadDos(){
        Queue q1 = new PriorityQueue();
        q1.add(6);
        q1.add(4);
        q1.add(8);
        q1.add(3);
        q1.add(2);
        
        System.out.println(q1);
    }
}
