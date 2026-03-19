//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.nombre = "ismael";

        empleado.salario = 2000;

        System.out.println("El empleado es: " + empleado.nombre);
        System.out.println("Salario inicial: " + empleado.salario);
        System.out.println("Salario final: " + empleado.calcularAumento(.10));
    }
}