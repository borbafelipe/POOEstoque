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



}
