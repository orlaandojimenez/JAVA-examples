package ejerciciouno;

public class Gato {
    
    public String nombre;
    public String raza;
    public String color;
    public int edad;
    
    public void maullar(){
        System.out.println("El gato " + this.nombre + " maulla asi: miaaaaaaau");
}
    public void ronronear(){
        System.out.println("El gato " + this.nombre + " ronronea asi: ggrrrr");
    }

    public String saluda(){
        return "El gato " + this.nombre + " saluda con una pata";
    }
    
    public int contar(){
        return 8;
    }
}
