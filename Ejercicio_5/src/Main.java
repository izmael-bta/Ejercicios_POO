//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.titulo = "Las loqueras de thomi";
        libro1.autor = "Katia";

        System.out.println(libro1.mostrarInformacion());
    }
}