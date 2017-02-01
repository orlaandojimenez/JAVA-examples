package comparaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparaciones {

    public static void main(String[] args) {
        List<Integer> genericos = new ArrayList<Integer>();
        genericos.add(123);
        genericos.add(420);
        genericos.add(69);
        genericos.add(66);
        genericos.add(42);
        
        System.out.println(genericos);
        
        Collections.sort(genericos);
        System.out.println(genericos);
        
        List<Comida> comidas = new ArrayList<Comida>();
        
        Comida c1 = new Comida("Pizza", 99, "amarillo");
        Comida c2 = new Comida("Spaguetti", 200, "verde");
        Comida c3 = new Comida("Lasagna", 150, "rojo");
        Comida c4 = new Comida("Hamburguesa", 40, "cafe");
        Comida c5 = new Comida("Burrito", 15, "beige");
        
        comidas.add(c1);
        comidas.add(c2);
        comidas.add(c3);
        comidas.add(c4);
        comidas.add(c5);
        
        for (Comida comida : comidas) {
            System.out.println(comida);
        }
        
        System.out.println("-----------------");
        
        Collections.sort(comidas);
        /*
        las clases que no implementen Comparable no se pueden ordenar
        al menos que utilicen un Comparator
        */
        for (Comida comida : comidas) {
            System.out.println(comida);
        }
        
        System.out.println("++++++++++++++++++++++++");
        
        List<Peliculas> pelis = new ArrayList<Peliculas>();
        Peliculas p1 = new Peliculas("Sharknado", "C", 120);
        Peliculas p2 = new Peliculas("Avengers", "B", 130);
        Peliculas p3 = new Peliculas("21 Jump Street", "B", 100);
        Peliculas p4 = new Peliculas("Hombre en llamas", "B", 120);
        Peliculas p5 = new Peliculas("300", "B", 140);
        
        pelis.add(p1);
        pelis.add(p2);
        pelis.add(p3);
        pelis.add(p4);
        pelis.add(p5);
        
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        
        Collections.sort(pelis, new  MoviesByNameComparator());
        System.out.println("NOMBRE ASCENDENTE");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        
        Collections.sort(pelis, new MoviesByClasificationComparator());
        System.out.println("CLASIFICACION ASCENDENTE");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
        
          
        Collections.sort(pelis, new MoviesByDurationComparator());
        System.out.println("DURACION ASCENDENTE");
        for (Peliculas peli : pelis) {
            System.out.println(peli);
        }
    }

}
