package Produto;

import Enum.NumCalcado;

public interface Calcado {

    void adicionarQuantidade(NumCalcado numCalcado, int quantidade);

    void removerQuantidade(NumCalcado numCalcado, int quantidade);

    int getQuantidade(NumCalcado numCalcado);
}
