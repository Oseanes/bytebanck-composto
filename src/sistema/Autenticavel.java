package sistema;

public abstract interface Autenticavel {
    public abstract boolean autentica(int senha);
    public abstract void setSenha( int senha);
    public abstract int getSenha();
}
