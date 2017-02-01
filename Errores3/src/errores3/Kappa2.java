
package errores3;

public class Kappa2 extends Kappa{
    
    /*
    los metoos que tienen exceptions y sean sobreescritos no pueden tirar mas excepciones que los metodos de su clase padre
    */
    @Override
    public void checarSiPositivo(int a) throws NegativeNumberException{
        System.out.println("ChecarSiPositivo Kappa2");
    }
}
