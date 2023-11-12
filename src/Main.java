// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            Conta conta = new Conta();
            conta.deposito(100);

            Cliente cliente = new Cliente();
            cliente.nome = "Oseanes D. Farias";

            conta.titular = cliente;

        System.out.println(conta.titular.nome);
    }
}