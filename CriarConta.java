public class CriarConta {
    public static void main(String[] args) {
        Cliente anderson = new Cliente("Anderson", "123.456.789-10", "Analista de Sistemas");

        ContaPoupanca poupanca = new ContaPoupanca(1234, 5678, anderson);

        poupanca.deposita(1000.00);
        poupanca.saca(100.00);
        System.out.println(poupanca.getSaldo());



        /*

        Conta conta = new Conta(1234, 5678, anderson);





        Conta conta2 = new Conta(4321,
                8765,
                new Cliente("Anderson",
                        "123.456.789-10",
                        "Analista de Sistemas"));

        conta.deposita(1000.00);



        conta.transfere(900.00, conta2);
        System.out.println("Saldo da conta 01: " + conta.getSaldo());
        System.out.println("Saldo da conta 02: " + conta2.getSaldo());





        System.out.println(conta.titular);
        System.out.println(conta.titular.getNome());
        System.out.println(conta.titular.getCpf());
        System.out.println(conta.titular.getProfissao());

        conta.titular.setProfissao("Programador Junior");
        System.out.println(conta.titular.getProfissao());

        anderson.setProfissao("Programador Senior alterada pelo objeto anderson");

        System.out.println(conta.titular.getProfissao());


          */








    }
}
