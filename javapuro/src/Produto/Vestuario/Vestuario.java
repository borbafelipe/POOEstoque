package Produto.Vestuario;

import java.util.HashMap;

import Produto.Enum.Disponibilidade;
import Produto.Enum.Tamanho;
import Produto.Produto;

public class Vestuario extends Produto {

    private HashMap<Tamanho, Integer> tamanhoPP;
    private HashMap<Tamanho, Integer> tamanhoP;
    private HashMap<Tamanho, Integer> tamanhoM;
    private HashMap<Tamanho, Integer> tamanhoG;
    private HashMap<Tamanho, Integer> tamanhoGG;

    public Vestuario(int id, String nome, String descricao, float valorUnitario, Disponibilidade disponibilidade, String codBarras) {
        setId(id);
        setNome(nome);
        setDescricao(descricao);
        setValorUnitario(valorUnitario);
        setDisponibilidade(disponibilidade);
        setCodBarras(codBarras);

        // Inicializa os HashMaps
        this.tamanhoPP = new HashMap<>();
        this.tamanhoP = new HashMap<>();
        this.tamanhoM = new HashMap<>();
        this.tamanhoG = new HashMap<>();
        this.tamanhoGG = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Vestuario [id=" + getId() + ", nome=" + getNome() + ", descricao=" + getDescricao() + ", valorUnitario="
                + getValorUnitario() + ", disponibilidade=" + getDisponibilidade() + ", tamanhoPP=" + tamanhoPP + ", codBarras="
                + getCodBarras() + ", tamanhoP=" + tamanhoP + ", tamanhoM=" + tamanhoM + ", tamanhoG=" + tamanhoG
                + ", tamanhoGG=" + tamanhoGG + ", getTamanhoPP()=" + getTamanhoPP() + ", getTamanhoP()=" + getTamanhoP()
                + ", getTamanhoM()=" + getTamanhoM() + ", getTamanhoG()=" + getTamanhoG() + ", getTamanhoGG()="
                + getTamanhoGG() + "]";
    }

    public HashMap<Tamanho, Integer> getTamanhoPP() {
        return tamanhoPP;
    }

    public void setQuantidadeTamanhoPP(int quantidade) {
        this.tamanhoPP.put(Tamanho.PP, quantidade);
    }

    public void addTamanhoPP(int quantidade) {
        this.tamanhoPP.put(Tamanho.PP, this.tamanhoPP.getOrDefault(Tamanho.PP, 0) + quantidade);
    }

    public void removeTamanhoPP(int quantidade) {
        this.tamanhoPP.put(Tamanho.PP, this.tamanhoPP.getOrDefault(Tamanho.PP, 0) - quantidade);
    }

    public HashMap<Tamanho, Integer> getTamanhoP() {
        return tamanhoP;
    }

    public void setQuantidadeTamanhoP(int quantidade) {
        this.tamanhoP.put(Tamanho.P, quantidade);
    }

    public void addTamanhoP(int quantidade) {
        this.tamanhoP.put(Tamanho.P, this.tamanhoP.getOrDefault(Tamanho.P, 0) + quantidade);
    }

    public void removeTamanhoP(int quantidade) {
        this.tamanhoP.put(Tamanho.P, this.tamanhoP.getOrDefault(Tamanho.P, 0) - quantidade);
    }

    public HashMap<Tamanho, Integer> getTamanhoM() {
        return tamanhoM;
    }

    public void setQuantidadeTamanhoM(int quantidade) {
        this.tamanhoM.put(Tamanho.M, quantidade);
    }

    public void addTamanhoM(int quantidade) {
        this.tamanhoM.put(Tamanho.M, this.tamanhoM.getOrDefault(Tamanho.M, 0) + quantidade);
    }

    public void removeTamanhoM(int quantidade) {
        this.tamanhoM.put(Tamanho.M, this.tamanhoM.getOrDefault(Tamanho.M, 0) - quantidade);
    }

    public HashMap<Tamanho, Integer> getTamanhoG() {
        return tamanhoG;
    }

    public void setQuantidadeTamanhoG(int quantidade) {
        this.tamanhoG.put(Tamanho.G, quantidade);
    }

    public void addTamanhoG(int quantidade) {
        this.tamanhoG.put(Tamanho.G, this.tamanhoG.getOrDefault(Tamanho.G, 0) + quantidade);
    }

    public void removeTamanhoG(int quantidade) {
        this.tamanhoG.put(Tamanho.G, this.tamanhoG.getOrDefault(Tamanho.G, 0) - quantidade);
    }

    public HashMap<Tamanho, Integer> getTamanhoGG() {
        return tamanhoGG;
    }

    public void setQuantidadeTamanhoGG(int quantidade) {
        this.tamanhoGG.put(Tamanho.GG, quantidade);
    }

    public void addTamanhoGG(int quantidade) {
        this.tamanhoGG.put(Tamanho.GG, this.tamanhoGG.getOrDefault(Tamanho.GG, 0) + quantidade);
    }

    public void removeTamanhoGG(int quantidade) {
        this.tamanhoGG.put(Tamanho.GG, this.tamanhoGG.getOrDefault(Tamanho.GG, 0) - quantidade);
    }
}
