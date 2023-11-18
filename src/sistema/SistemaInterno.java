package sistema;

public class SistemaInterno {

    private int senha = 2222;

    public boolean autentica(Autenticavel acesso){
        return acesso.autentica(this.senha);
    }
}
