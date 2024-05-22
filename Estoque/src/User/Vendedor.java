package User;

<<<<<<< Updated upstream
public interface Vendedor {
    void consultarEstoque();
    boolean realizarVenda(String produtoID, String tamanho);
    void verVendas();
=======
public final class Vendedor extends User{

    public Vendedor(String nome, String userID, String cpf) {
        super(nome, userID, cpf, false);
    }
>>>>>>> Stashed changes
}
