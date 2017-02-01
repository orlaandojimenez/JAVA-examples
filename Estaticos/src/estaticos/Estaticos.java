
package estaticos;


public abstract class Estaticos {

    
    public static void main(String[] args) {
        /*
        no se pueden acceder a metodos o variables estaticos sin instancia(objeto) de la clase
        */
        Matematicas m1 = new Matematicas();
        Matematicas m2 = new Matematicas();
        System.out.println(Matematicas.sumar(5, 3));
        //System.out.println(Matematicas.multiplicar(4,3));
        /*.out.println(m1.restar(5, 3));
        System.out.println(m2.sumar(2, 9));
        System.out.println(m2.restar(6, 1));*/
        System.out.println("Pi: " + m1.pi);
        //Matematicas.pi = 5;
        System.out.println("Pi: " + m2.pi);
       
        
    }
    
}
