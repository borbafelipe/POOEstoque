package Negocioacoes;

import java.time.LocalDateTime;

public final class Entrada extends Negociacao {

    private String nomeFornecedor;
    private Double valorUnitarioFornecedor;

    public Entrada(String produtoID, String userId, LocalDateTime realizacao, float valorTotal, String nomeFornecedor) {
        super(produtoID, userId, realizacao, valorTotal);
        this.nomeFornecedor = nomeFornecedor;
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

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

}
