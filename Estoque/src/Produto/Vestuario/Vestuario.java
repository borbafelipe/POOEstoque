package Produto.Vestuario;

import Produto.Enum.Disponibilidade;
import Produto.Produto;
import java.time.LocalDateTime;
import java.util.Map;

<<<<<<< Updated upstream
public class Vestuario {
    private String produtoID;
    private String nome;
    private String descricao;
    private int preco;
=======
public final class Vestuario extends Produto {
>>>>>>> Stashed changes
    private Map<String, Integer> quantidadePorTamanho;

    public Vestuario(int id, String nome, String descricao, LocalDateTime horarioCadastro, float valorUnitario,
            int quantidadeDisponivel, Disponibilidade disponibilidade, String codBarras) {
        super(id, nome, descricao, horarioCadastro, valorUnitario, quantidadeDisponivel, disponibilidade, codBarras);
    }
   

   /*  public Vestuario(String produtoID, String nome, String descricao, double preco) {
        this.produtoID = produtoID;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadePorTamanho = new HashMap<>();
    }*/

    // Getters e Setters
<<<<<<< Updated upstream

    public String getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(String produtoID) {
        this.produtoID = produtoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
=======
    
>>>>>>> Stashed changes

    public Map<String, Integer> getQuantidadePorTamanho() {
        return quantidadePorTamanho;
    }

    @Override
    public String getCodBarras() {
        // TODO Auto-generated method stub
        return super.getCodBarras();
    }


    @Override
    public String getDescricao() {
        // TODO Auto-generated method stub
        return super.getDescricao();
    }


    @Override
    public Disponibilidade getDisponibilidade() {
        // TODO Auto-generated method stub
        return super.getDisponibilidade();
    }


    @Override
    public LocalDateTime getHorarioCadastro() {
        // TODO Auto-generated method stub
        return super.getHorarioCadastro();
    }


    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }


    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }


    @Override
    public int getQuantidadeDisponivel() {
        // TODO Auto-generated method stub
        return super.getQuantidadeDisponivel();
    }


    @Override
    public float getValorUnitario() {
        // TODO Auto-generated method stub
        return super.getValorUnitario();
    }


    @Override
    public void setCodBarras(String codBarras) {
        // TODO Auto-generated method stub
        super.setCodBarras(codBarras);
    }


    @Override
    public void setDescricao(String descricao) {
        // TODO Auto-generated method stub
        super.setDescricao(descricao);
    }


    @Override
    public void setDisponibilidade(Disponibilidade disponibilidade) {
        // TODO Auto-generated method stub
        super.setDisponibilidade(disponibilidade);
    }


    @Override
    public void setHorarioCadastro(LocalDateTime horarioCadastro) {
        // TODO Auto-generated method stub
        super.setHorarioCadastro(horarioCadastro);
    }


    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }


    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }


    @Override
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        // TODO Auto-generated method stub
        super.setQuantidadeDisponivel(quantidadeDisponivel);
    }


    @Override
    public void setValorUnitario(float valorUnitario) {
        // TODO Auto-generated method stub
        super.setValorUnitario(valorUnitario);
    }


    public void setQuantidadePorTamanho(Map<String, Integer> quantidadePorTamanho) {
        this.quantidadePorTamanho = quantidadePorTamanho;
    }
}
