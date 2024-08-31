package br.barbearia.modelo;
//criando a subclasse Cliente
public class Cliente extends Pessoa {
    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome() + "\nCPF: " + getCpf() + "\n Telefone: " + getTelefone());
    }
}
