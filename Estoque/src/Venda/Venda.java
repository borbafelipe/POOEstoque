package Venda;

import java.time.LocalDateTime;

public class Venda {
    private String produtoID;
    private String tamanho;
    private String vendedorID;
    private LocalDateTime data;

    public Venda(String produtoID, String tamanho, String vendedorID) {
        this.produtoID = produtoID;
        this.tamanho = tamanho;
        this.vendedorID = vendedorID;
        this.data = LocalDateTime.now();
    }

    
    public String getProdutoID() {
        return produtoID;
    }

    public void setProdutoID(String produtoID) {
        this.produtoID = produtoID;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getVendedorID() {
        return vendedorID;
    }

    public void setVendedorID(String vendedorID) {
        this.vendedorID = vendedorID;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
