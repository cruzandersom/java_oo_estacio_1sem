public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario anderson = new Funcionario();
        System.out.println(anderson.getNome());
        System.out.println(anderson.getCpf());
        System.out.println(anderson.getSalario());
        anderson.setNome("Anderson");
        anderson.setCpf("12345678910");
        anderson.setSalario(2500.00);
        System.out.println(anderson.getNome());
        System.out.println(anderson.getCpf());
        System.out.println(anderson.getSalario());

    }
}
