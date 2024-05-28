package Negociacoes;

import java.time.LocalDateTime;

public class Negociacao{
    
    //Atributos
    private String produtoID;
    private String userId;
    private LocalDateTime realziacao;
    private float valorTotal;

    
    public Negociacao(String produtoID, String userId, LocalDateTime realziacao, float valorTotal) {
        this.produtoID = produtoID;
        this.userId = userId;
        this.realziacao = realziacao;
        this.valorTotal = valorTotal;
    }


    public String getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(String produtoID) {
        this.produtoID = produtoID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getRealziacao() {
        return realziacao;
    }

    public void setRealziacao(LocalDateTime realziacao) {
        this.realziacao = realziacao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

}
