package estaticos;
//final en las clases impide la herencia
public /*final*/ class Matematicas {
    
    static{
        //bloque static
        //se ejecuta al cargar la clase
        //solo se pueden manejar miembros estaticos
        
        //pi = 9;
        //x = 6;
    }
    
    public static final double pi = 3.141516;
    public static double e = 2.71;
    public int x = 3;
    
    public static final int sumar(int a, int b){
        return(a + b);
    }
    
    public static int restar(int a, int b){
        return(a - b);
    }
    
    public int multiplicar(int a, int b){
        return(a * b);
    }
}
