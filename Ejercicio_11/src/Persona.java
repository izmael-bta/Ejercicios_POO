public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    String info(){
        return "nombre " + nombre + "Edad " + edad;
    }
}
