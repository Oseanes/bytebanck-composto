package cliente;

import conta.Tributavel;
import sistema.Tributo;

public class SeguroDeVida implements Tributavel {
    private double seguroDeVida;
    private Tributo tributo;
    public SeguroDeVida(){
        this.tributo = new Tributo();
    }
    @Override
    public double getValorImposto() {
        return tributo.imposto(this.seguroDeVida);
    }

    @Override
    public void setAliquita(double aliquita) {
        this.tributo.setAliquita(aliquita);
    }

    public void setSeguroDeVida(double seguroDeVida) {
        this.seguroDeVida = seguroDeVida;
    }

}
