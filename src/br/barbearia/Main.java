package br.barbearia;
import br.barbearia.modelo.Cliente;
import br.barbearia.modelo.Funcionario;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("________BEM VINDO A BARBEARIA________");
        System.out.println("Selecione a operação desejada: ");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Funcionário");
        System.out.println("3 - Cadastrar Corte de cabelo");
        System.out.println("4 - Listar Cliente");
        System.out.println("5 - Listar Funcionários");
        System.out.println("6 - Listar Corte de cabelo");
        System.out.println("7 - Executar um corte de cabelo");
        System.out.println("8 - Sair");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("________Cadastrar Cliente________");

                System.out.println("Digite o nome do cliente: ");
                String nome = sc.next();

                System.out.println("Digite o CPF do cliente: ");
                String cpf = sc.next();

                System.out.println("Digite o telefone do cliente: ");
                String telefone = sc.next();

                Cliente cliente = new Cliente(nome, cpf, telefone);

                System.out.println("Cliente cadastrado com sucesso!");
                System.out.println("Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nTelefone: " + cliente.getTelefone());
                break;
            case 2:
                System.out.println("________Cadastrar Funcionario________");

                System.out.println("Digite o nome do Funcionario: ");
                String nomeFuncionario = sc.next();

                System.out.println("Digite o CPF do Funcionario: ");
                String cpfFuncionario = sc.next();

                System.out.println("Digite o telefone do Funcionario: ");
                String telefoneFuncionario = sc.next();

                System.out.println("Digite o cargo do Funcionario: ");
                String cargoFuncionario = sc.next();

                Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, telefoneFuncionario, cargoFuncionario);

                System.out.println("Cliente cadastrado com sucesso!");
                System.out.println("Nome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() + "\nTelefone: " + funcionario.getTelefone() + "\nCargo: " + funcionario.getCargo());
                break;
        }

    }
}
