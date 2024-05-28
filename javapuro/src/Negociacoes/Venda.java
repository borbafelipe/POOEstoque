package Negociacoes;

import java.time.LocalDateTime;

public class Venda extends Negociacao{
    

    private double comissaoVendedor;
    private double valorUnitarioVenda;
    private double lucro;

    
    public Venda(String produtoID, String userId, LocalDateTime realziacao, float valorTotal, double comissaoVendedor,
            double valorUnitarioVenda, double lucro) {
        super(produtoID, userId, realziacao, valorTotal);
        this.comissaoVendedor = comissaoVendedor;
        this.valorUnitarioVenda = valorUnitarioVenda;
        this.lucro = lucro;
    }

    
    public double getComissaoVendedor() {
        return comissaoVendedor;
    }
    public void setComissaoVendedor(double comissaoVendedor) {
        this.comissaoVendedor = comissaoVendedor;
    }
    public double getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }
    public void setValorUnitarioVenda(double valorUnitarioVenda) {
        this.valorUnitarioVenda = valorUnitarioVenda;
    }
    public double getLucro() {
        return lucro;
    }
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}
