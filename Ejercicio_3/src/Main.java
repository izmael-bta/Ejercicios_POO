//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        rectangulo.base = 3;
        rectangulo.altura = 5;

        System.out.println("El area es = " + rectangulo.calcularArea());
    }
}