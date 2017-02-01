
package wrappers;


public class Wrappers {

    
    public static void main(String[] args) {
        //variables primitivas
        char a;
        short b;
        int c;
        long d;
        float e;
        double f;
        byte g;
        boolean h;
        
        //variables wrappers
        
        Character a2;
        Short b2;
        Integer c2;
        Long d2;
        Float e2;
        Double f2;
        Byte g2;
        Boolean h2;
        
        //los wrappers se pueden inicializar como primitivos o como clases
        
        c2 = 5;
        d2 = new Long(125);
        e2 = new Float("125.2f");
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        
        System.out.println("---------");
        
        Integer x1 = 28;
        Integer x2 = 28;
        Integer x3 = 129;
        Integer x4 = 129;
        if (x1 == x2) {
            System.out.println("x1 == x2");
        }
        if (x1.equals(x2)) {
            System.out.println("x1 equals x2");
        }
        if (x3 == x4) {
            System.out.println("x3 == x4");
        }
        if (x3.equals(x4)) {
            System.out.println("x3 equals x4");
        }
        
        System.out.println("---------");
        
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Short MAX_VALUE: " + Short.MAX_VALUE);
        System.out.println("Long MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Byte MAX_VALUE: " + Byte.MAX_VALUE);
        System.out.println("Character MAX_VALUE: " + Character.MAX_VALUE);
        
        int y = Integer.parseInt("120");
        System.out.println(y);
        
        System.out.println("---------");
        
        x1 = 10;
        System.out.println("28 en binario:  " + Integer.toBinaryString(x1));
        System.out.println("28 en hexadecimal:  " + Integer.toHexString(x1));
        System.out.println("28 en octal:  " + Integer.toOctalString(x1));
        
        System.out.println("----------------");
        
        int x = Integer.valueOf("2");
        System.out.println("x: " + x);
    }
    
}
