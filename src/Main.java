public class Main {
    public static void main(String[] args) {

        Cliente khaly = new Cliente();
        khaly.setNome("Khaly");

        IConta cc = new ContaCorrente(khaly);
        IConta poupanca = new ContaPoupanca(khaly);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}