package funcionario;

import sistema.AutenticacaoAcesso;
import sistema.Autenticavel;
public class Gerente extends Funcionario implements Autenticavel {
    AutenticacaoAcesso autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoAcesso();
    }
    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    @Override
    public int getSenha() {
        return autenticador.getSenha();
    }
    public double bonus(){
        return super.getSalario();
    }
}
