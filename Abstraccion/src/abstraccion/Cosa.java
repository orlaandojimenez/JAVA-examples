package abstraccion;

public abstract class Cosa {
    private String forma;
    private String color;
    private String material;
    private String tamanio;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    public Cosa(String forma, String color, String material, String tamanio){
        this.forma =  forma;
        this.color = color;
        this.material = material;
        this.tamanio = tamanio;
        
                    }
    public abstract void existir();
    
    protected abstract void romperse(); 
    
}
