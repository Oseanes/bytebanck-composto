package funcionario;

public class Gerente extends Funcionario{
    private int senha;

    public boolean autenticaSenha(int senha){
        return this.senha == senha;
    }
    public double bonos(){
        return super.getSalario();
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }
}
