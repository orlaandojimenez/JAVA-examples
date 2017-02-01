package coleccionesdos;

public class ColeccionesDos {

    public static void main(String[] args) {
        Colas c1 = new Colas();
        
        //c1.colaDePrioridad();
        
        /*
        los priorityqueue se representan con un arbol binario cargado a la izquerda
        */
        
       c1.colaDePrioridadDos();
       
        System.out.println("-------");
        
        Metodos m1 = new Metodos();
        m1.metodoUno();
        System.out.println("------------");
        
        Genericos g1 = new Genericos();
        g1.metodoGenerico();
    }

}
