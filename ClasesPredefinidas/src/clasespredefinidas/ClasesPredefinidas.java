
package clasespredefinidas;

public class ClasesPredefinidas {

    
    public static void main(String[] args) {
        /*String cadena = "Ejemplo1";
        String cadena2 = new String();
        String cadena3 = new String("Ejemplo2");
        System.out.println(cadena.charAt(4)); //imprime el caracter 4
        System.out.println(cadena.concat(" algo")); //concatena
        System.out.println(cadena);
        cadena = cadena.concat(" algo");
        System.out.println(cadena);
        System.out.println("-----");
        if(cadena.contains("a")){ //imprime si contiene a
            System.out.println("si esta la subcadena");
        }
        System.out.println("-----");
        System.out.println(cadena.indexOf("e"));
        System.out.println(cadena.length()); //imprime la longitud
        
        System.out.println(cadena.substring(4,5)); //imrpime desde el caracter 4 al 5
        System.out.println(cadena.toLowerCase()); //minuscula
        System.out.println(cadena.toUpperCase()); //mayuscula
        System.out.println("----------");
        cadena = " Juan Jose ";
        System.out.println(cadena);
        System.out.println(cadena.trim()); //quita los espacios del principio y el final
        System.out.println("--------");
        System.out.println("Clase Math");
        System.out.println(Math.PI); //constantes
        System.out.println(Math.E);
        System.out.println(Math.abs(-4)); //valor absoluto
        System.out.println(Math.ceil(69.37)); //redondea hacia arriba
        System.out.println(Math.floor(69.37)); //redondea hacia abajo
        System.out.println(Math.max(25, 36));
        System.out.println(Math.min(25, 36));
        System.out.println(Math.pow(3,-2)); //exponente
        System.out.println(Math.random()); //numero aleatorio
        System.out.println(Math.ceil(Math.random()*10)); //numero aleatorio entero
        System.out.println(Math.round(5.5)); //redondea al mas cercano
        System.out.println(Math.sqrt(81)); //raiz cuadrada
        System.out.println(Math.sin(1)); //funcion seno en radianes
        System.out.println(Math.toDegrees(Math.PI)); //convierte radianes a grados
        System.out.println(Math.toRadians(180)); //convierte grados a radianes
        System.out.println("---------");
        System.out.println("String Builder");*/
        
        /*StringBuilder sb = new StringBuilder("Primero");
        System.out.println(sb);
        System.out.println(sb.append(" Segundo")); //es como el concat
        System.out.println(sb);
        System.out.println(sb.reverse()); //imprime al reves
        System.out.println(sb);
        sb = new StringBuilder("Algo");
        System.out.println(sb);
        System.out.println(sb.capacity()); //imrpime la capacidad de la variable
        sb.append(" Abecedario");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.append(" Ferrocarril");
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        System.out.println("-----------");
        System.out.println("String Buffer");
        
        StringBuffer sf = new StringBuffer("Un texto");
        System.out.println(sf);*/
        
        Ejercicio e1 = new Ejercicio();
        String st = e1.polindromo("joto");
        System.out.println(st);
    }
    
}
