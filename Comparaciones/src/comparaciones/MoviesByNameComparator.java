package comparaciones;

import java.util.Comparator;

public class MoviesByNameComparator  implements Comparator<Peliculas>{
//retorna un positivo si el primer argumento es mayor al segundo
    //retorna cero si los argumentos son iguales
    //retorna un negativo si el primero es menor al segundo
    @Override
    public int compare(Peliculas o1, Peliculas o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
    

}
