public class CuentaBancaria {
    String titular;
    double saldo;

    public double Depositar(double deposito){
        if (deposito >= 0){
            saldo = saldo + deposito;
        }
        return saldo;
        }
    public double Retirar(double retiro){
        if (retiro > saldo){
            System.out.println("Saldo insuficiente");
        }else {
            saldo = saldo - retiro;
        }
        return saldo;
    }
}
