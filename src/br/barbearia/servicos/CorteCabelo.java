package br.barbearia.servicos;

public class CorteCabelo extends Servico {
    public CorteCabelo(String descricao, double preco) {
        super(descricao, preco);
    }
    @Override
    public void executar(){
        System.out.println("Serviço de Corte de Cabelo selecionado!");
    }

}
