import funcionario.Funcionario;

public class ControleBonificacao {
    private double total;

    public void registra(Funcionario funcionario){
        this.total += funcionario.bonus();
    }

    public double getTotal() {
        return total;
    }
}
