// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

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
    }
}