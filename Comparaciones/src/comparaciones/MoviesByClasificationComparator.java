package comparaciones;

import java.util.Comparator;

public class MoviesByClasificationComparator implements Comparator<Peliculas> {

    @Override
    public int compare(Peliculas o1, Peliculas o2) {
        return o1.getClasificacion().compareTo(o2.getClasificacion());
    }

}
