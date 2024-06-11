package Produto.Vestuario;

import Produto.Enum.Disponibilidade;
import Produto.Produto;
import java.time.LocalDateTime;

public final class Calcados extends Produto {

    public Calcados(int id, String nome, String descricao, LocalDateTime horarioCadastro, float valorUnitario,
            int quantidadeDisponivel, Disponibilidade disponibilidade, String codBarras) {
        super(id, nome, descricao, horarioCadastro, valorUnitario, quantidadeDisponivel, disponibilidade, codBarras);
    }

    @Override
    public final  String getCodBarras() {
        // TODO Auto-generated method stub
        return super.getCodBarras();
    }

    @Override
    public final String getDescricao() {
        // TODO Auto-generated method stub
        return super.getDescricao();
    }

    @Override
    public Disponibilidade getDisponibilidade() {
        // TODO Auto-generated method stub
        return super.getDisponibilidade();
    }

    @Override
    public LocalDateTime getHorarioCadastro() {
        // TODO Auto-generated method stub
        return super.getHorarioCadastro();
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public int getQuantidadeDisponivel() {
        // TODO Auto-generated method stub
        return super.getQuantidadeDisponivel();
    }

    @Override
    public float getValorUnitario() {
        // TODO Auto-generated method stub
        return super.getValorUnitario();
    }

    @Override
    public void setCodBarras(String codBarras) {
        // TODO Auto-generated method stub
        super.setCodBarras(codBarras);
    }

    @Override
    public void setDescricao(String descricao) {
        // TODO Auto-generated method stub
        super.setDescricao(descricao);
    }

    @Override
    public void setDisponibilidade(Disponibilidade disponibilidade) {
        // TODO Auto-generated method stub
        super.setDisponibilidade(disponibilidade);
    }

    @Override
    public void setHorarioCadastro(LocalDateTime horarioCadastro) {
        // TODO Auto-generated method stub
        super.setHorarioCadastro(horarioCadastro);
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        // TODO Auto-generated method stub
        super.setQuantidadeDisponivel(quantidadeDisponivel);
    }

    @Override
    public void setValorUnitario(float valorUnitario) {
        // TODO Auto-generated method stub
        super.setValorUnitario(valorUnitario);
    }

}
