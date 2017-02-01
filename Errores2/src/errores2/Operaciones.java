
package errores2;


public class Operaciones {
    public void division(Integer a, Integer b){
        //cuando hay un error en el try el codigo faltante del try no es ejecutado
        //el finally siempre se ejecuta
        //el try necesita inimo un catch o un finally
          try {
                Integer c = a / b;
              System.out.println("Entro en el try");
            System.out.println("c: " + c);        } 
          catch (ArithmeticException ae) {
             System.err.println("Excepcion aritmetico");
        }
          catch(NullPointerException ne){
              System.err.println("Excepcion Null Pointer");
          }
            finally{
              System.out.println("Estamos en el finally");
          }
          
         try{
             
         } finally{
             
         }
         
    }
    
    public void divisiondos(int a, int b)throws ArithmeticException{
       /* try{
                    int c = a / b;
        
        }
        catch(Exception e){
            throw new StackOverflowError();
            throw new ClassCastException();
            
        }*/
        //throw new ClassCastException();
        int c = a / b;
        System.out.println("c: " + c);
        
    }
    
    public void divisiontres(float a, float b){
        float c = a / b;
        System.out.println("c: " + c);
    }
    
    public void excepcionesComunes(){
        //int a = Integer.parseInt("uno");
        //System.out.println(a);
        double b = Double.valueOf("dos");
        System.out.println("b: " + b);
    }
    
    public void recursivo(){
        recursivo();
    }
    
    public void metodoAlgo(){
        int arreglo[] = new int[-5];
       // System.out.println("Posicion 6: " + arreglo[6]);
        System.out.println("Posicion -3: " + arreglo[-3]);
    }
}
