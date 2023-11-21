package conta;
import cliente.Cliente;

public abstract class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private static int total;
    private Cliente titular;

    public Conta(int agencia, int numero){
        Conta.total++;
        if(agencia > 0 && numero > 0){
            this.agencia = agencia;
            this.numero = numero;
        }
    }
    public boolean deposito(double valor){
        if(valor>0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public void saque(double valor) throws SaldoInsuficienteExcecao {
        if(this.saldo < valor){
            throw new SaldoInsuficienteExcecao("Saldo: " + this.saldo + " Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void tranferencia( double valor, Conta conta) throws SaldoInsuficienteExcecao{
        this.saque(valor);
        conta.deposito(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public static int getTotal() {
        return total;
    }
}
