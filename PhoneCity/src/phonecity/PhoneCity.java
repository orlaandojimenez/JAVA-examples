package phonecity;

public class PhoneCity {

   
    public static void main(String[] args) {
       Celular c1 = new Celular("Apple", "iPhone 6"); // constructor es el procedimiento que se ejecuta al formar el objeto
       c1.modelo = "iPhone 4";
       c1.so = "Windows";
     
       
        Celular c2 = new Celular("iPhone 6");   
        
        c1.marcar();
        c1.marcar();
        c1.timbrando("Ojos");
        
    }
    
}
