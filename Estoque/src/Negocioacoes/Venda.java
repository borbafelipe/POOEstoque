package Negocioacoes;

import java.time.LocalDateTime;

public final class Venda extends Negociacao {

    private double comissaoVendedor;
    private double valorUnitarioVenda;
    private double lucro;

    public Venda(String produtoID, String userId, LocalDateTime realziacao, float valorTotal) {
        super(produtoID, userId, realziacao, valorTotal);
        //duvida: como devo utilziar esse atributo abaixo: GS oyhu 
        this.comissaoVendedor = valorTotal * 0.05;
    }

    @Override
    public String getProdutoID() {
        // TODO Auto-generated method stub
        return super.getProdutoID();
    }

    @Override
    public LocalDateTime getRealziacao() {
        // TODO Auto-generated method stub
        return super.getRealziacao();
    }

    @Override
    public String getUserId() {
        // TODO Auto-generated method stub
        return super.getUserId();
    }

    @Override
    public float getValorTotal() {
        // TODO Auto-generated method stub
        return super.getValorTotal();
    }

    @Override
    public void setProdutoID(String produtoID) {
        // TODO Auto-generated method stub
        super.setProdutoID(produtoID);
    }

    @Override
    public void setRealziacao(LocalDateTime realziacao) {
        // TODO Auto-generated method stub
        super.setRealziacao(realziacao);
    }

    @Override
    public void setUserId(String userId) {
        // TODO Auto-generated method stub
        super.setUserId(userId);
    }

    @Override
    public void setValorTotal(float valorTotal) {
        // TODO Auto-generated method stub
        super.setValorTotal(valorTotal);
    }

    



}
