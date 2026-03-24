public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ismael", 20);
        Persona persona2 = new Persona("Ana", -5);

        System.out.println(persona1.info());
        System.out.println(persona2.info());
    }
}
