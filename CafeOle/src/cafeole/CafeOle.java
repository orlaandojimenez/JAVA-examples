package cafeole;

public class CafeOle {

   
    public static void main(String[] args) {
        
        Cafe c1 = new Cafe();
        c1.sabor = "chocolate";
        c1.preparacion = "frio";
        c1.precio = 39.00;
        c1.observaciones = "chispas de chocolate";
        
        Cafe c2 = new Cafe("Leche light");
       
        Cafe c3 = new Cafe("grande", 25.00);
        
        c1.entrega();
        c2.orden();
        c3.recibido();
    }
    
}
