package list.OperacoesBasicas;

public class Item{
    private String name;
    private double preco;
    private int quantidade;

    public Item(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "\nItem name = " + name + ",\npreco = " + preco + ",\nquantidade = " + quantidade + "\n ";
    }
}