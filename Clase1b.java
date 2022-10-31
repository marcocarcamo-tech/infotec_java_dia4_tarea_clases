package _tarea;

import java.util.Objects;

public class Clase1b extends Clase1{

    public Clase1b(String nombre, String apellidos, Integer edad, String email) {
        super(nombre, apellidos, edad, email);
        
    }
    @Override
    public int hashCode() {
    
    return Objects.hashCode(getNombre());
    }
}
