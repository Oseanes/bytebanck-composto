import cliente.SeguroDeVida;
import conta.ContaCorrente;
import conta.SaldoInsuficienteExcecao;
import sistema.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            ContaCorrente cc = new ContaCorrente(111, -222);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}