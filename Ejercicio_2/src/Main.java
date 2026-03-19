//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.marca = "Nissan";
        coche1.modelo = "Versa";
        coche1.año = 2022;

        Coche coche2 = new Coche();
        coche2.marca = "Muzda";
        coche2.modelo = "Muzda 3";
        coche2.año = 2023;

        Coche coche3 = new Coche();
        coche3.marca = "Nissan";
        coche3.modelo = "Suru";
        coche3.año = 2024;

        System.out.println(coche1.informacionCoche());
        System.out.println(coche2.informacionCoche());
        System.out.println(coche3.informacionCoche());
    }
}