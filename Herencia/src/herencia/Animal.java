package herencia;

public class Animal {
    //caracteristicas de la herencia
    //1 solo se puede heredar de un padre
    //2 se pueden tener los hijos que quieras
    //3 se heredan todos los metodos y atributos
    //4 las clases hijas se consideran del mismo tipo que las clases padre
    //5 los constructores no se heredan
    //6 se tiene que cnstruir la clase padre para oder construir la clase hijo
    public String color;
    public String especie;
    public int edad;

    public Animal(String color, String especie, int edad) {
        this.color = color;
        this.especie = especie;
        this.edad = edad;
    }
    
    
    public void comer(){
        System.out.println("Animal comiendo");
    }
    
    public void dormir(){
        System.out.println("Animal durmiendo");
    }
    
    public void respirar(){
        System.out.println("Animal respirando");
    }
}
