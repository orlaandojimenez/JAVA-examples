
package Operativos;

public class Distancia {
    

    public static void main(String[] args){
	double distancia = 0;
	distancia = Math.sqrt(Math.pow(Integer.parseInt(args[3])-Integer.parseInt(args[1]), 2)+Math.pow(Integer.parseInt(args[2])-Integer.parseInt(args[0]),2));
			      System.out.println("La distancia es: "+distancia);
    
}
    
}
