package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
      }

    // Item lista  
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    // Adicionar Item
    public void adicionarItem(String name, double preco, int quantidade){
        Item item = new Item(name, preco, quantidade);
        this.itemList.add(item);
    }

    // Remover Item
    public void removerItem(String name) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
          for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
              itensParaRemover.add(i);
            }
          }
          itemList.removeAll(itensParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    //Calcular Valor total
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
        }
        return valorTotal;
    }else {
        throw new RuntimeException("A lista está vazia");
    }
   }

   // Exibir itens
   public void exibirItens(){
    if(!itemList.isEmpty()){
        System.out.println(this.itemList);
    }else {
        System.out.println("A lista está vazia!");
    }
   }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itemList=" + itemList + "]";
    }
}