package sistema;

import conta.Tributavel;

public class CalculoDoImposto {

    private double totalImposto;
    public void registra(Tributavel tributavel){
        this.totalImposto += tributavel.getValorImposto();
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
