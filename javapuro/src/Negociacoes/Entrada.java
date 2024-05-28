package Negociacoes;

import java.time.LocalDateTime;

public class Entrada {

    //Atributios
    private String nomeFornecedor;
    private Double valorUnitarioFornecedor;
    private LocalDateTime dataEntrada = LocalDateTime.now();


//Construtor
   public Entrada(String nomeFornecedor, Double valorUnitarioFornecedor, LocalDateTime dataEntrada) {
        this.nomeFornecedor = nomeFornecedor;
        this.valorUnitarioFornecedor = valorUnitarioFornecedor;
        this.dataEntrada = dataEntrada;
    }

    //Metodos
    private String getNomeFornecedor() {
        return nomeFornecedor;
    }
    private void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    private Double getValorUnitarioFornecedor() {
        return valorUnitarioFornecedor;
    }
    private void setValorUnitarioFornecedor(Double valorUnitarioFornecedor) {
        this.valorUnitarioFornecedor = valorUnitarioFornecedor;
    }

    private LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    private void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    
}
