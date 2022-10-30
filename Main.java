package _tarea;

public class Main {

    

    

    public static void main(String[] args) {
        // Instancias
    
    Clase1 clase1 = new Clase1("Juan", "Perez", 21, "Juan@mail.com");

    Clase1 clase1b = new Clase1b("José", "Ríos", 27, "Jose@mail.com");

    Clase2 clase2 = new Clase2();

    Clase2 clase2b = new Clase2b();

     // Comparacion con la funcion equals

    System.out.println(clase1.equals(clase1b)); // true

    System.out.println(clase2.equals(clase2b)); // true

    System.out.println(clase1.equals(clase2)); 

    System.out.println(clase1.equals(clase2b));


    } 
    

    
    

}
