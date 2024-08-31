package servicos;

public class Barba {
    private String nome;
    private double preco;

    public Barba(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
        else {
            System.out.println("O valor precisa ser positivo.");
        }
    }
}
