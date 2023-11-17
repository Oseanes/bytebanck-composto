import conta.ContaCorrente;
import conta.ContaPoupanca;
import funcionario.Funcionario;
import funcionario.Gerente;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Conta conta = new Conta(1233, 243);
        conta.deposito(100);
        conta.setTitular(new Cliente("Oseanes Dias de Farias", "222.222.222-22"));

        Conta conta1 = new Conta(5611, 567);
        conta.deposito(1290);
        conta.setTitular(new Cliente("Marta S. soares", "222.222.222-22"));
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getTitular().getCpf());

        System.out.println("Total:" + Conta.getTotal());

          Gerente g = new Gerente();
        g.setNome("Oseanes");
        g.setSenha(234);
        g.setSalario(3000.00);

        Funcionario f = new Funcionario();
        f.setSalario(2500.00);

        ControleBonificacao c = new ControleBonificacao();
        c.registra(g);
        c.registra(f);
        System.out.println(c.getTotal());
        */

        ContaCorrente cc = new ContaCorrente(1234, 432);
        ContaPoupanca cp = new ContaPoupanca(333, 213);

        cc.deposito(100.0);
        cp.deposito(250.0);

        cc.tranferencia(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());



    }
}