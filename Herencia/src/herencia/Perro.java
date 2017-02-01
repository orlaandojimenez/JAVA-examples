package herencia;

public class Perro extends Animal {

    public String pelo;
    /*metodo super:
    1 debe ir en la primera linea del constructor o un this()
    2 si no hay un super en el constructor se usuara un super default(super sin argumentos)
    
    */
    public Perro(String color, String especie, int edad, String pelo) {
        //super();
        super(color, especie, edad);
        this.pelo = pelo;
    }
    
    public Perro(){
        this("blanco con negro", "dalmata", 4, "mediano");
        this.pelo = "largo";
        /*this.color = "blanco con negro";
        this.edad = 4;
        this.especie = "dalmata";*/
    }
    
    /*reglas de la sobreescritura
    1 solo se sobreescribe metodos ya existemtes
    2 los metodos tienen que llevar la misma firma
    3 los tipos de retorno no deben variar
    4 la anotacion @override es opcional
    5 se puede llamar al metodo padre con la palabra super
    6 la palabra super no necesariamente se usa en la primera linea
    */
    @Override
    public void comer(){
        super.comer();
        System.out.println("Perro comiendo");
        this.dormir();
        
    }
    
     public void comer(int a){
        System.out.println("comer sobrecargado");
    }  
     
    @Override
     public void dormir(){
         System.out.println("Perro durmiendo");
     }
     
    @Override
     public String toString(){
         return this.color + this.especie + this.edad + this.pelo;
     }

}
