package conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    public boolean saque(double valor){
        return super.saque(valor + 0.2);
    }

}
