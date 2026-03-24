public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.radio = 5;

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
    }
}
