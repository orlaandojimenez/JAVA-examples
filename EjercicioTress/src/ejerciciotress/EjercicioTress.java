package ejerciciotress;

public class EjercicioTress {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        if (a != b) {
            System.out.println("a es diferente de b");
        }
        if (a <= b) {
            System.out.println("a es menor o igual a b");
        }
        if (a == 4 && b == 5) {
            System.out.println("a=4 y b=5");
        }
       // AND es && las dos se deben cumplir
        //OR || una se debe cumplir
        //NOT ! cambia de verdadero a falso

        int c = 1;
        c -= a; //es como si fuera c=c-a
        System.out.println(--c);

        int d = 20;
        d /= 2;
        System.out.println(d);

        System.out.println("----------------");

        d = 1;
        switch (d) {
            case 1:
                System.out.println("b=1");
                break;
            case 2:
                System.out.println("b=2");
                break;
            case 10:
                System.out.println("d=10");
                break;
            default:
                System.out.println("Estoy en el caso default");
        }

        Condicion c1 = new Condicion();
        c1.diadelasemana(6);

        //operador ternario es un signo de pregunta ?:
        int x = (d == 1) ? 4 : 2;
        System.out.println(x);
        
        int carros = 1;
        System.out.println("Tienes " + carros + ((carros > 1) ? " carros" : " carro"));

    }

}
