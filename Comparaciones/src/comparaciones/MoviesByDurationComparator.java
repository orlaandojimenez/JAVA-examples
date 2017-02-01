package comparaciones;

import java.util.Comparator;

public class MoviesByDurationComparator implements Comparator<Peliculas>{

    @Override
    public int compare(Peliculas o1, Peliculas o2) {
         return o1.getDuracion()-o2.getDuracion();
    }

}
