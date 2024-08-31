package br.barbearia.modelo;
//criando a subclasse Funcionario
public class Funcionario extends Pessoa {
    public Funcionario(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome() + "\nCPF: " + getCpf() + "\n Telefone: " + getTelefone());
    }
}
