package Taller;



// Programa en el cual se ingresen cuatro numeros, calcular e imprimir la suma del 1 y 2 y el producto del 3 y 4//
import java.util.Scanner;
public class Programa2 {
     public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        int A,B,C,D,sum,prod;
        System.out.println("Creado por: Orlando Jimenez Rodriguez");
        System.out.println("Matricula: 1554983");
        System.out.println("Jueves M5-M6");
        System.out.println("Introduzca el primer numero");
        A=in.nextInt();
        System.out.println("Introduzca el segundo numero");
        B=in.nextInt();
        System.out.println("Introduzca el tercer numero");
        C=in.nextInt();
        System.out.println("Introduzca el cuarto numero");
        D=in.nextInt();
        sum=A+B;
        prod=C*D;
        System.out.println("La suma de los primeros 2 numeros es:"+sum);
        System.out.println("El producto de los  ultimos 2 numeros es:"+prod);
    
}
}
