package _tarea;

import java.util.Objects;

public class Clase1 {

    private String nombre;
    private String apellidos;
    private Integer edad;
    private String email;

    //Constructor de la clase 1
    public Clase1( String nombre, String apellidos, Integer edad, String email) { 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public boolean equals(Object obj){
        //En este caso el valor de la comparación entre objetos es el atributo nombre. Si el nombre es diferente en dos objetos, devolverá false.
        Clase1 claseComparacion = (Clase1) obj;
        return this.nombre.equals(claseComparacion.getNombre());
    }

    @Override
    public int hashCode() {
    
    return Objects.hashCode(getNombre());
    }
}
