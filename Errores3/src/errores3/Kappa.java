
package errores3;

public class Kappa {
    public void division(Integer a, Integer b){
        
        try {
            Integer c = a / b;
            System.out.println("c: " + c);
        } catch (Exception e) {
            System.err.println("Error");
        }finally{
            System.out.println("finally");
        }
    }
    
    public void checarSiPositivo(int a) throws NegativeNumberException{
        if (a >= 0) {
            System.out.println("Me pasaste un numero positivo, para mi si es aceptable");
        }
        else{
            throw new NegativeNumberException();
        }
    }
    
    public void positivo(int a) throws PositiveNumberException{
        if(a >= 0){
            throw new PositiveNumberException();
        }else{
            System.out.println("Aceptable, numero negativo");
        }
    }
}
