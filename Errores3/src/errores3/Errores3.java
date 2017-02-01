
package errores3;

public class Errores3 {

    
    public static void main(String[] args) throws NegativeNumberException {
        Kappa k1 = new Kappa();
        k1.division(42, 3);
        k1.division(42, 0);
        System.out.println("------------");
        
        try {
             k1.checarSiPositivo(8);
        } catch (NegativeNumberException nne) {
            System.out.println("Error en checarSipositivo. Error: " + nne.getMessage());
        }
        
        try {
             k1.checarSiPositivo(-8);
        } catch (NegativeNumberException nne) {
            System.err.println("Error en checarSipositivo. Error: " + nne.getMessage());
        }
        
        System.out.println("---------");
        
        
        Kappa2 kd1 = new Kappa2();
        
        kd1.checarSiPositivo(2);
        kd1.checarSiPositivo(-5);
        
        System.out.println("-------");
        
        try {
            k1.positivo(4);
        } catch (PositiveNumberException p) {
            System.err.println("Error en positivo.Error: " + p.getMessage());
        }
    }
    
}
