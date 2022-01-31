public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Fabio");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(150);
        cc.depositar(2000);

        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(2150, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
