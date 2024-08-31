package br.barbearia.servicos;

public abstract class Servico {
    private String descricao;
    private double preco;

    public Servico(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPreco(){
        return preco;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreci(double preco){
        this.preco = preco;
    }

    public abstract void executar();
}
