
package errores2;

public class Errores2 {

   
    public static void main(String[] args) {
        Gato g1 = new Gato("Corriente", "Gris", 2);
        Gato g2 = new Gato("Corriente", "Gris", 4);
        Gato g3 = new Gato("Persa", "Negro", 3);
        
        if (g1.equals(g2)) {
            System.out.println("g1.equals(g2)");
        }
         if (g1.equals(g3)) {
            System.out.println("g1.equals(g3)");
        }
         
         System.out.println("----------");
         
         Operaciones o1 = new Operaciones();
         o1.division(7, 7);
         System.out.println("----------------");
         
         try {
            o1.divisiondos(5, 0);
        } catch (Exception e) {
             System.out.println("Catcheado en Errores2.java");
        }
         
         o1.divisiontres(-5.4F, 0);
         
         System.out.println("---------");
         
         //o1.excepcionesComunes();
         
         //o1.recursivo();
         
         o1.metodoAlgo();
       
    }
    
}
