public class Empleado {
    String nombre;
    double salario;

    public double calcularAumento(double porcentaje){
        salario += salario * porcentaje;
        return salario;
    }
}
