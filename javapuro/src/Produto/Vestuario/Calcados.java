package Produto.Vestuario;

import Produto.Produto;
import Produto.Enum.Disponibilidade;

public class Calcados extends Produto{

    public Calcados(int id, String nome, String descricao, float valorUnitario,
    int quantidadeDisponivel, Disponibilidade disponibilidade, String codBarras) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.disponibilidade = disponibilidade;
        this.codBarras = codBarras;
    }
}

