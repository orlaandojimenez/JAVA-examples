package clasespredefinidas;

public class Ejercicio {
    
    public String polindromo(String cadena){
        cadena = cadena.toLowerCase();
        cadena = cadena.replace(" ", "");
        cadena = cadena.replace("\t", "");
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        if (cadena.equals(sb.toString())) {
            return("Es un palindromo");
        }
        else
            return("No es un palindromo");
    }
}