package sistema;

public class Tributo {
    private double aliquita;

    public void setAliquita(double aliquita) {
        this.aliquita = aliquita;
    }
    public double imposto(double valor){
        return this.aliquita * valor;
    }
}
