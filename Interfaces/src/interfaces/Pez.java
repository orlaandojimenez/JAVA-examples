package interfaces;

public class Pez extends Animal implements Nadador {

    @Override
    public void comer() {
        System.out.println("pez comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("pez durmiendo");
    }

    @Override
    public void nadar() {
        System.out.println("pez nadando");
    }

    @Override
    public void bucear() {
        System.out.println("pez buceando");
    }

}
