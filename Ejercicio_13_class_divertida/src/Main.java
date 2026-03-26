import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodoPi metodoPi = new MonteCario();

        System.out.print("Ingresa la cantidad de iteraciones: ");
        int iteraciones = scanner.nextInt();

        double pi = metodoPi.calcular(iteraciones);
        System.out.println("El pi es: " + pi);
    }
}
