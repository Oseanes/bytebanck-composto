package conta;

import sistema.Tributo;

public class ContaCorrente extends Conta implements Tributavel{

    private Tributo tributo;
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
        this.tributo =  new Tributo();
    }
    @Override
    public double getValorImposto() {
        return tributo.imposto(super.getSaldo());
    }

    public void saque(double valor) throws SaldoInsuficienteExcecao{
        super.saque(valor + 0.2);
    }

    public void setAliquita(double aliquita) {
        this.tributo.setAliquita(aliquita);
    }

    public Tributo getTributo() {
        return this.tributo;
    }
}
