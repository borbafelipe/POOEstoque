package Produto;

import java.util.Map;

import Enum.NumRoupa;


public interface RoupaNum {
    Map<NumRoupa, Integer> estoqueNumRoupa= null;
    void adicionarQuantidade(NumRoupa numRoupa, int quantidade);
    void removerQuantidade(NumRoupa numRoupa, int quantidade);
    int getQuantidade(NumRoupa numRoupa);
}
