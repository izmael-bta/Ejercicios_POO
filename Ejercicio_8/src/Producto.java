public class Producto{
    String nombre;
    double precio;

    public double mostrarPrecioFinal(double iva){
        return (precio * iva) + precio;
    }
}
