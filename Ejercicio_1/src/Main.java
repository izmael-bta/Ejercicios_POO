//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Katia";
        persona1.edad = 23;

        Persona persona2 = new Persona();

        persona2.nombre = "Barndom";
        persona2.edad = 23;

        System.out.println(persona1.obtenerDatos());
        System.out.println(persona2.obtenerDatos());
    }
}