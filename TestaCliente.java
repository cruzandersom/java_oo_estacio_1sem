public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "222.222.222-22", "Analista de Sistemas");
        System.out.println(cliente);
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getProfissao());
        cliente.setProfissao("Programador Junior");
        System.out.println(cliente.getProfissao());



    }
}
