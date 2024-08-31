import servicos.*;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a operação: ");
        System.out.println("1 Cadastrar novo corte.");
        System.out.println("2 Cadastrar novo corte de barba.");
        System.out.println("3 Remover corte.");
        System.out.println("4 remover corte de barba.");
        System.out.println("5 Cobrar.");
        System.out.println("6 Sair.");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Cadastrar novo corte.");
                System.out.println("Digite o nome do corte: ");
                String corte = sc.next();
                System.out.println("Digite o valor do corte: ");
                double valor = sc.nextDouble();
            case 2:
                System.out.println("Cadastrar novo corte de barba.");
                System.out.println("Digite o nome do corte: ");
                String barba = sc.next();
                System.out.println("Digite o valor do corte: ");
                double valorBarba = sc.nextDouble();
        }

    }
}
