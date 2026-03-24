
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        estudiante1.nombre = "isma";
        estudiante1.calificacion1 = 7;
        estudiante1.calificacion2 = 7;
        estudiante1.calificacion3 = 7;
        int numMaterias = 3;


        System.out.println("\nEl promedio de : " + estudiante1.nombre + "es " + estudiante1.calcularPromedio() / numMaterias);
    }
}