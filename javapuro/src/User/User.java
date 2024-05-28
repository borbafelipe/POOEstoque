package User;

public class User implements Gestor, Vendedor {

    private String nome;
    private String tipo;

    // Construtor para definir o tipo de usuário
    public User(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

       

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    @Override
    public void venderProduto(int idProduto, int quantidade) {
       
        
    }



    @Override
    public void criarEstoque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'criarEstoque'");
    }



    @Override
    public void gerirVendas() {
        
        throw new UnsupportedOperationException("Unimplemented method 'gerirVendas'");
    }
}
