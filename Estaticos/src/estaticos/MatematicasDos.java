package estaticos;

public class MatematicasDos extends Matematicas{

    public static int restar(int a, int b){
        return(a - b);
    }
    
    @Override
    public int multiplicar(int a, int b){
        return(a * b);
    }
    
    /*error: no se puede sobreescribir un metodo estatico y final
    public static final int sumar(int a, int b){
        return(a + b);
    }*/
}
