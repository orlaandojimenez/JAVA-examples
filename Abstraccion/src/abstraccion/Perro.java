package abstraccion;

public abstract class Perro extends Animal{

    @Override
    public void comer() {
        System.out.println("Perro comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Perro durmiendo");
    }

    

}
