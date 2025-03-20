public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
    }

    @Override
    public boolean saca(double valor) {
        return super.saca(valor + 0.10);
    }
}
