package br.barbearia.modelo;
//criando a subclasse Funcionario
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String telefone, String cargoFuncionario) {
        super(nome, cpf, telefone);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + getNome() + "\nCPF: " + getCpf() + "\n Telefone: " + getTelefone() + "\nCargo: " + getCargo());
    }
}
