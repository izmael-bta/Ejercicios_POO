
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();

        p1.nombre = "Doritos";
        p1.precio = 100;

        System.out.println("El precio final es: " + p1.mostrarPrecioFinal(.16));
    }
}