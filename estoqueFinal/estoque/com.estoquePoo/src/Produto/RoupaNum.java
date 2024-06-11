package Produto;

import Enum.NumRoupa;


public interface RoupaNum {
    void adicionarQuantidade(NumRoupa numRoupa, int quantidade);
    void removerQuantidade(NumRoupa numRoupa, int quantidade);
    int getQuantidade(NumRoupa numRoupa);
}
