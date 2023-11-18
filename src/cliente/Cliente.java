package cliente;

import sistema.AutenticacaoAcesso;
import sistema.Autenticavel;

public class Cliente implements Autenticavel {
    private String nome;
    private String cpf;
    private String profissao;
    AutenticacaoAcesso autenticador;
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.autenticador = new AutenticacaoAcesso();
    }

    @Override
    public void setSenha(int senha) {
        autenticador.setSenha(senha);
    }

    @Override
    public int getSenha() {
        return autenticador.getSenha();
    }

    @Override
    public boolean autentica(int senha) {
        return autenticador.autentica(senha);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
