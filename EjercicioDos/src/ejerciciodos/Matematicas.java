package ejerciciodos;

public class Matematicas {
    public int sumar(int a, int b){
        if (a==b){
            return a+b;
        }
        else if(a>b){
            return 32;
        }
        else {
            return a-b;
        }
        
    }
    
    public int restar(int a, int b){
        return a - b;
    }
    
    public int multiplicar(int a, int b){
        return a * b;
    }
    
    public double dividir(double a, double b){
        return a / b;
    }
    
    public int modulo(int a, int b){
        return a % b;
    }
    
    public int doble(int a){
        return a * 2;
    }
    
    public boolean multiplo(int a){
        return a%3==0;
    }
    
    public String evaluar(int a){
        if(a>0)
            return "El numero es mayor a cero";
        
        else if(a==0)
            return "El numero es igual a cero";
        
        else
            return "El numero es menor a cero";
    }

}
