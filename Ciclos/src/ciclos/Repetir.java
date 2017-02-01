package ciclos;

import java.util.Arrays;

public class Repetir {

    public void repetiruno() {
        //for primero inicializamos, segundo comparaciones, tercero ejecucion al final del bloque
        for (int i = 0, a = 3; i < 10; i++) {
            System.out.println(i);
            System.out.println("Finalizo");
        }
        System.out.println("---------------");
    }

    public void repetirdos() {
        int a = 3;
        while (a > -5) {
            a--;
            if (a == -2) {
                continue;
            }
            System.out.println(a);
        }
        System.out.println("--------------");
    }

    public void repetirtres() {
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a < 10);
        System.out.println("-----------");
    }

    public void pares() {
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void primos(int a) {
        int x = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                x++;
            }
        }
        if (x > 0) {
            System.out.println(a + "No es numero primo");
        } else {
            System.out.println(a + "Es primo");
        }
    }

    public void multiplo() {
        for (int i = 3; i < 100; i += 3) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }

    public void repetircuatro() {
        int arr[] = {3, 5, 8, 2, 6, 8, 4};
        System.out.println("Arreglo desordenado: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int busqueda = Arrays.binarySearch(arr, 4);
        System.out.println("Posicion: " + busqueda);
    }

    public void repetircinco(String nombre, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nombre + arr[i]);
        }

    }

    public void repetirseis(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("con foreach");
        for (String cadena : arr) {
            System.out.println(cadena);
        }
    }

    public void repetirsiete(int arr[][]) {
        for (int[] is : arr) {
            for (int i : is) {
                System.out.println(i);
            }
        }
    }

    public void arreglo(String arr[][]) {
        System.out.println("CON FOR");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("CON FOREACH");
        for (String[] cadena : arr) {
            for (String cadena1 : cadena){
                System.out.println(cadena1);
            }
        }
            

        

    }

}
