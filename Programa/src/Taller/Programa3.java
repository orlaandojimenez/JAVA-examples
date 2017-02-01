package Taller;

//Programa que lea 4 valores numericos e informar su suma y promedio//
import java.util.Scanner;
public class Programa3 {
    public static void main(String[]arg){
        Scanner in = new Scanner(System.in);
        float A,B,C,D,sum,prom;
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
        sum=A+B+C+D;
        prom=sum/4;
        System.out.println("La suma es:"+sum);
        System.out.println("El promedio es:"+prom);
    
}
}
