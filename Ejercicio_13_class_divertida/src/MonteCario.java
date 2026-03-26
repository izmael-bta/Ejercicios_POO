import java.util.Random;

public class MonteCario implements MetodoPi {
    private final Random random = new Random();

    @Override
    public double calcular(int iteraciones) {
        if (iteraciones <= 0) {
            return 0;
        }

        int dentro = 0;
        for (int i = 0; i < iteraciones; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <= 1) {
                dentro++;
            }
        }

        return 4.0 * dentro / iteraciones;
    }
}
