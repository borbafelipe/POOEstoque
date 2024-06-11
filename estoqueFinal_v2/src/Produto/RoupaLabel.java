package Produto;

import Enum.LabelRoupa;

public interface RoupaLabel {
    void adicionarQuantidade(LabelRoupa label, int quantidade);
    void removerQuantidade(LabelRoupa label, int quantidade);
    int getQuantidade(LabelRoupa label);
}
