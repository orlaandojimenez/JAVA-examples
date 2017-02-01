package ejerciciouno;

public class EjercicioUno {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        Perro p3 = new Perro();
        Perro p4 = new Perro();
        Perro p5 = new Perro();
        
        Gato g1 = new Gato();
        Gato g2 = new Gato();
        Gato g3 = new Gato();
        Gato g4 = new Gato();
        Gato g5 = new Gato();
        
        g1.nombre = "Pelusa";
        g1.raza = "siames";
        g1.color = "blanco";
        g1.edad = 4;
        
        g2.nombre = "Malvavisco";
        g2.raza = "arabe";
        g2.color = "gris";
        g2.edad = 7;
        
        g3.nombre = "Gato con botas";
        g3.raza = "siames";
        g3.color = "cafe";
        g3.edad = 8;
        
        g4.nombre = "Tom";
        g4.raza = "ragdol";
        g4.color = "gris";
        g4.edad = 1;
        
        g5.nombre = "Solovino";
        g5.raza = "callejero";
        g5.color = "negro";
        g5.edad = 8;
                
        p1.color = "blanco";
        p1.edad = 6;
        p1.raza = "poodle";
        p1.tamanio = "chico";
        p1.nombre = "Tomy";
        
        p2.color = "negro";
        p2.edad = 2;
        p2.raza = "chihuahua";
        p2.tamanio = "chico";
        p2.nombre = "negra";
        
        p3.color = "cafe";
        p3.edad = 14;
        p3.raza = "salchicha";
        p3.tamanio = "chico";
        p3.nombre = "Serafin";
        
        p4.color = "gris";
        p4.edad = 9;
        p4.raza = "snauser";
        p4.tamanio = "chico";
        p4.nombre = "chiquis";
        
        p5.color = "negro";
        p5.edad = 11;
        p5.raza = "doverman";
        p5.tamanio = "grande";
        p5.nombre = "huesos";
        
        /*
        System.out.println("El color del perro es: " + p1.color);
        System.out.println("La raza del perro es: " + p1.raza);
        System.out.println("El nombre del perro es: " + p1.nombre);
        System.out.println("La edad del perro es: " + p1.edad);
        System.out.println("El tamanio del perro es: " + p1.tamanio);
        System.out.println("");
        
        System.out.println("El color del perro es: " + p2.color);
        System.out.println("La raza del perro es: " + p2.raza);
        System.out.println("El nombre del perro es: " + p2.nombre);
        System.out.println("La edad del perro es: " + p2.edad);
        System.out.println("El tamanio del perro es: " + p2.tamanio);
        System.out.println("");
        
        System.out.println("El color del perro es: " + p3.color);
        System.out.println("La raza del perro es: " + p3.raza);
        System.out.println("El nombre del perro es: " + p3.nombre);
        System.out.println("La edad del perro es: " + p3.edad);
        System.out.println("El tamanio del perro es: " + p3.tamanio);
        System.out.println("");
        
        System.out.println("El color del perro es: " + p4.color);
        System.out.println("La raza del perro es: " + p4.raza);
        System.out.println("El nombre del perro es: " + p4.nombre);
        System.out.println("La edad del perro es: " + p4.edad);
        System.out.println("El tamanio del perro es: " + p4.tamanio);
        System.out.println("");
        
        System.out.println("El color del perro es: " + p5.color);
        System.out.println("La raza del perro es: " + p5.raza);
        System.out.println("El nombre del perro es: " + p5.nombre);
        System.out.println("La edad del perro es: " + p5.edad);
        System.out.println("El tamanio del perro es: " + p5.tamanio);
        System.out.println("");
        
        p1.ladrar();
        p3.ladrar();
                */
        
        System.out.println("El nombre del gato es: " + g1.nombre);
        System.out.println("La raza del gato es: " + g1.raza);
        System.out.println("El color del gato es: " + g1.color);
        System.out.println("La edad del gato es: " + g1.edad);
        System.out.println("");
        
        System.out.println("El nombre del gato es: " + g2.nombre);
        System.out.println("La raza del gato es: " + g2.raza);
        System.out.println("El color del gato es: " + g2.color);
        System.out.println("La edad del gato es: " + g2.edad);
        System.out.println("");
        
        System.out.println("El nombre del gato es: " + g3.nombre);
        System.out.println("La raza del gato es: " + g3.raza);
        System.out.println("El color del gato es: " + g3.color);
        System.out.println("La edad del gato es: " + g3.edad);
        System.out.println("");
        
        System.out.println("El nombre del gato es: " + g4.nombre);
        System.out.println("La raza del gato es: " + g4.raza);
        System.out.println("El color del gato es: " + g4.color);
        System.out.println("La edad del gato es: " + g4.edad);
        System.out.println("");
        
        System.out.println("El nombre del gato es: " + g5.nombre);
        System.out.println("La raza del gato es: " + g5.raza);
        System.out.println("El color del gato es: " + g5.color);
        System.out.println("La edad del gato es: " + g5.edad);
        System.out.println("");
        
        g1.maullar();
        g5.ronronear();
        
        //String cadena = g1.saluda();
        System.out.println(g1.saluda());
        System.out.println(g2.saluda());
        System.out.println(g3.saluda());
        System.out.println(g4.saluda());
        System.out.println(g5.saluda());
        
        System.out.println(g1.contar());
        
        
    }
        
    }

