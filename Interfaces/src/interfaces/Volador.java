package interfaces;


public interface Volador {
    //las interfaces son 100% abstractas
    //no permiten implementar ningun metodo
    //no se pueden declarar variables dnetro de las interfaces, solo constantes
    //todos los metodos en interfaces son publicos y abstractos aun y cuando no se pongan explicitamente
    Integer a1 = 12;
    public abstract void volar();
    void aterrizar();
    
        
    
}
