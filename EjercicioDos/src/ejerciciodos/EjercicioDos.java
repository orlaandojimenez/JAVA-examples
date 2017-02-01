package ejerciciodos;


public class EjercicioDos {

    
    public static void main(String[] args) {
        int entero; //enteros , numeros positivos y negativos
        String cadena; //texto entre comillas
        byte var1; //enteros chicos, sirve para ahorrar memoria
        long var2; //guarda enteros mayores que el int
        char var3; //guarda un solo caracter, entre comillas simples
        float var4; // guarda numeros decimales 
        double var5; //guarda numeros decimales con mayor rango que el float
        boolean var6; //verdadero o  falso
        short var7; //guarda enteros mayores a byte y menores que int
        
        entero = 4;
        cadena = "texto\n";
        var1 = 15;
        var2 = 1500L;
        var3 = 'a';
        var4 = 20.3F;
        var5 = 674.9;
        var6 = true;
        var7 = 4567;
        
        System.out.println(entero);
        System.out.println(cadena);
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        
        int res = entero + var7;
        System.out.println(res);
        int resta = var7 - entero;
        System.out.println(resta);
        double mult = var5 * var1;
        System.out.println(mult);
        double div = var5 / entero;
        System.out.println(div);
        int modulo = var1 % entero;
        System.out.println(modulo);
        
        Matematicas m1 = new Matematicas();
        
        System.out.println("La suma de 4 + 5 es: " + m1.sumar(4, 5));
        System.out.println("La resta de 67 - 5 es: " + m1.restar(67, 5));
        System.out.println("La mult de 4 x 5 es: " + m1.multiplicar(4, 5));
        System.out.println("La div de 50 / 7 es: " + m1.dividir(50, 7));
        System.out.println("El modulo de 7 % 2 es: " + m1.modulo(7, 2));
        
        System.out.println(m1.doble(74));
        System.out.println(m1.multiplo(20));
        System.out.println(m1.evaluar(-5));
    }
    
}
