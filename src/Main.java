import cliente.SeguroDeVida;
import conta.ContaCorrente;
import sistema.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Gerente g = new Gerente();
//
//        Administrador a = new Administrador();
//        a.setSenha(11);
//
//        Design d = new Design();
//        SistemaInterno s = new SistemaInterno();
//        Cliente c = new Cliente("Oseanes", "222.222.222-22");
//        c.setSenha(2222);
//        System.out.println(s.autentica(c));

        ContaCorrente cc = new ContaCorrente(111,114);
        cc.deposito(1000);
        cc.setAliquita(0.1);
        SeguroDeVida sd = new SeguroDeVida();
        sd.setSeguroDeVida(10000);
        sd.setAliquita(0.1);

        CalculoDoImposto ci = new CalculoDoImposto();
        ci.registra(cc);
        ci.registra(sd);
        System.out.println(ci.getTotalImposto());

    }
}