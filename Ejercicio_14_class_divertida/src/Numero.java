import java.util.Scanner;

public class Numero {
    private int minimo;
    private int maximo;
    private int intentos;

    public Numero(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.intentos = 0;
    }

    public void jugar(Scanner scanner) {
        System.out.println("Piensa en un numero del " + minimo + " al " + maximo + ".");
        System.out.println("Intentare adivinarlo.");
        System.out.println("Responde con:");
        System.out.println("1.- el numero es mayor");
        System.out.println("2.- el numero es menor");
        System.out.println("3.- si la adivine");;


        while (minimo <= maximo) {
            int intento = (minimo + maximo) / 2;
            intentos++;

            System.out.println("El numero es : " + intento);
            System.out.print("Tu respuesta: ");
            int respuesta = scanner.nextInt();

            if (respuesta == 3) {
                System.out.println("Adivine tu numero en " + intentos + " intentos.");
                return;
            }

            if (respuesta == 1) {
                minimo = intento + 1;
            } else if (respuesta == 2) {
                maximo = intento - 1;
            } else {
                System.out.println("Respuesta incorrecta");
                intentos--;
            }
        }

        System.out.println("No se pudo adivinar el numero.");
    }
}