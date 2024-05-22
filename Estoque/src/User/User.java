package User;

public abstract class User {

    protected String nome;
    protected String userID;
    protected String cpf;
    protected boolean eGestor;

    public User(String nome, String userID, String cpf, boolean eGestor) {
        this.nome = nome;
        this.userID = userID;
        this.cpf = cpf;
        this.eGestor = false;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean iseGestor() {
        return eGestor;
    }
    
}
