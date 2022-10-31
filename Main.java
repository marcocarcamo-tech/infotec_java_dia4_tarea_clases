package _tarea;

public class Main {

    

    

    public static void main(String[] args) {
        // Instancias
    
    Clase1 clase1 = new Clase1("Juan", "Perez", 21, "Juan@mail.com");

    Clase1 clase1b = new Clase1b("José", "Ríos", 27, "Jose@mail.com");

    Clase1 clase1c = new Clase1("Juan", "García", 22, "JuanG@mail.com");
 
    Clase2 clase2 = new Clase2();
    

    Clase2 clase2b = new Clase2b();

     // Comparacion del nombre de la Clase 2 con la funcion equals

    System.out.println(clase1.equals(clase1b)); // false

    System.out.println(clase1.equals(clase1c)); // true

   
    //Comparando hash code de nombre de las instancias de la clase 1
    
    System.out.println(clase1.hashCode()); // 2320088
    System.out.println(clase1b.hashCode()); // 2315003
    System.out.println(clase1c.hashCode()); // 2320088


    //Acceso a un método estático de la Clase2 sin una instancia de la clase
    String mensajeMetodo1 = Clase2.metodo2("Accediendo a este método", "Tipo de acceso: sin instancia");

    //Imprime en consola el mensaje
    System.out.println(mensajeMetodo1);
    

    //Acceso a un método estático de la Clase2 sin una instancia de la clase
    String mensajeMetodo2 = clase2.metodo2("Accediendo a este método", "Tipo de acceso: con instancia");

    //Imprime en consola el mensaje

    System.out.println(mensajeMetodo2);
    } 
}
