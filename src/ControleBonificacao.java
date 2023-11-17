import funcionario.Funcionario;

public class ControleBonificacao {
    private double total;

    public void registra(Funcionario funcionario){
        this.total += funcionario.bonos();
    }

    public double getTotal() {
        return total;
    }
}
