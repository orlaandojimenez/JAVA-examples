package interfaces;

public class Pajaro extends Animal implements SuperVolador {

    //las clases no pueden heredar de interfaces
    //las clases pueden implementar interfaces
    //la cantidad de interfaces implementadas no tiene un limite

    @Override
    public void comer() {
        System.out.println("pajaro comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Pajaro durmiendo");
    }

    @Override
    public void superVolar() {
        System.out.println("pajaro supervolando");
    }

    @Override
    public void volar() {
        System.out.println("pajaro volando");
    }

    @Override
    public void aterrizar() {
        System.out.println("pajaro aterrizando");
    }

}
