package errores;

public class Operaciones {

    public void division(Integer a, Integer b) {
        Integer c = 0;

        //solo se puede ejecutar un catch
        //los catch deben de ir de mas particular al mas general
        try {
            c = a / b;
        } catch (ArithmeticException | NullPointerException e) {
            //System.out.println("Error Aritmetico");
            //e.printStackTrace(System.out);
            //System.err.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println("Excepcion comun");
        }
        System.out.println("c: " + c);

    }

    
       
}
