import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcularArea metodo = new CalcularArea();

        System.out.println("INGRESA EL NUMERO DEL RADIO");
        int radio = sc.nextInt();


        System.out.println(metodo.calcular(radio));

    }
}