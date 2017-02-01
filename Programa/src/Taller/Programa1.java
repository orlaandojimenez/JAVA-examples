package Taller;



//Programa que capture dos numeros enteros desde teclado e imprima la suma y su producto//
import java.util.Scanner;
        public class Programa1 {

    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        int A,B,sum,prod;
        System.out.println("Creado por: Orlando Jimenez Rodriguez");
        System.out.println("Matricula: 1554983");
        System.out.println("Jueves M5-M6");
        System.out.println("Introduzca el primer numero");
        A=in.nextInt();
        System.out.println("Introduzca el segundo numero");
        B=in.nextInt();
        sum=A+B;
        prod=A*B;
        System.out.println("La suma de los numeros es:"+sum);
        System.out.println("El producto de los numeros es:"+prod);
         }
    
            
            
    
}
