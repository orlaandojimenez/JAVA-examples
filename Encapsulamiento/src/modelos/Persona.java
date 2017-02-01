package modelos;

public class Persona {
    /*modificadores de acceso
    1 public: todos tienen acceso a el, es el modificador sin restriccion
    2 protected: solo tienen acceso las clases hijas y las que se encuentran en el mismo paquete
    3 [default]: solo tienen acceso las clases en el mismo paquete
    4 private: solo tiene acceso la misma clase
    */
    
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    private double peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>0 && edad<100) {
            this.edad = edad;
        }
        else
            System.out.println("edad no valida");
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
