package EjemploHilos;

public class EjemploDosHilos extends Thread {
    
    public void run(){
        for(int i=20;i>0;i--){
        System.out.println(i);
        try{
            sleep(2000);
        }catch(Exception ex){
            System.out.println("Error");
        }
    }
    }
    
    public static void main(String[]args){
        EjemploDosHilos mihilo = new EjemploDosHilos();
        mihilo.start();
    }
    
}
