//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.titular = "Isma";
        cuentaBancaria.saldo = 500;

        System.out.println("Saldo despues del deposito " + cuentaBancaria.Depositar(100));
        System.out.println("Saldo depsues del retiro " + cuentaBancaria.Retirar(50));
    }
}