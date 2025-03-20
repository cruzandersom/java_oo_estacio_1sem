public abstract class Conta {
    private int agencia;
    private int numero;

    private double saldo;

    Cliente titular;

    public static int total;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        this.saldo = 100.0;
        Conta.total++;

    }


    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Depositando R$" + valor + " na conta de " + this.titular);

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Sacando R$" + valor + " da conta de " + this.titular);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor + " na conta de " + this.titular);
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Imprimindo a conta de destino: " + destino);
            destino.deposita(valor);
            System.out.println("Transferindo R$" + valor + " da conta de " + this.titular + " para a conta de " + destino.titular);
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valor + " da conta de " + this.titular + " para a conta de " + destino.titular);
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }


}
