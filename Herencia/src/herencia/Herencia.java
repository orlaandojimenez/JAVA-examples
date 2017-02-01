package herencia;

public class Herencia {

    public static void main(String[] args) {
       Animal a1 = new Animal("blanco", "canino", 3); 
        System.out.println("Animal");
      /* a1.color = "negro";
       a1.respirar();
       a1.dormir();*/
       
        a1.comer();
        
       Perro p1 = new Perro("cafe", "canino", 5, "corto");
        System.out.println("Perro");
       /*p1.edad = 4;
       p1.dormir();
       p1.color = "blanco";*/
       
        p1.comer();
        
        Perro p2 = new Perro();
        System.out.println("Perro 2");
        System.out.println("Perro2 pelo: " + p2.pelo);
        
        System.out.println(p2);
        
       /*Chihuahua ch1 = new Chihuahua();
        System.out.println("Chihuahua");
        ch1.dormir();
        ch1.respirar();
        ch1.color = "cafe";
        
        System.out.println("------------");
        
        if (a1 instanceof Animal) {
            System.out.println("a1 es un animal");
        }
        if (a1 instanceof Perro) {
            System.out.println("a1 es un perro");
        }
        if (ch1 instanceof Animal) {
            System.out.println("ch1 es un animal");
        }
        if (ch1 instanceof Perro) {
            System.out.println("ch1 es un perro");
        }
        if (ch1 instanceof Chihuahua) {
            System.out.println("ch1 es un chihuahua");
        }
        */
        System.out.println("------------");
        String cadena = "pepito";
        String cadena2 = "pepito";
        String cadena3 = new String("pepito");
        System.out.println("Cadena: " + cadena);
        System.out.println("Cadena2: " + cadena2);
        System.out.println("Cadena3: " + cadena3);
        
        if (cadena == cadena2) {
            System.out.println("cadena == cadena 2");
        }
        
        if (cadena == cadena3) {
            System.out.println("cadena == cadena3");
        }
        
        if (cadena.equals(cadena3)) {
            System.out.println("cadena equals cadena3");
        }
        
        if (p1 == p2) {
            System.out.println("p1 == p2");
        }
        
        if (p1.equals(p2)) {
            System.out.println("p1 equals p2");
        }
        
        Perro p3 = p1;
        System.out.println("-----");
        
        if (p1 == p3) {
            System.out.println("p1 == p3");
        }
        
        if (p1.equals(p3)) {
            System.out.println("p1 equals p3");
        }
    }
    
}
