package User;

public interface Vendedor {
    void consultarEstoque();
    boolean realizarVenda(String produtoID, String tamanho);
    void verVendas();
}
