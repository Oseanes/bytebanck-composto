public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public boolean deposito(double valor){
        this.saldo += valor;
        return true;
    }

    public boolean saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean tranferencia( double valor, Conta conta){
        if(this.saque(valor)){
            conta.deposito(valor);
            return true;
        }
        return false;
    }
}
