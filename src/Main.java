import cliente.SeguroDeVida;
import conta.ContaCorrente;
import conta.SaldoInsuficienteExcecao;
import sistema.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1111, 222);
        cc.deposito(200.0);

        try {
            cc.saque(210);
        } catch (SaldoInsuficienteExcecao ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(cc.getSaldo());

    }
}