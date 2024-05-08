package main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;


    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    //Criando métodos
    public void adicionarItens(String nomeItem, double precoItem, int quantidadeItem) {
        Item item = new Item(nomeItem, precoItem, quantidadeItem);
        this.itemList.add(item);
    }

    public void removerItens(String nomeItem) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i: itemList){
                if (i.getNomeItem().equalsIgnoreCase(nomeItem)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotalCarrinho = 0d;
       for (Item item : itemList){
           double valorItem = item.getPrecoItem() * item.getQuantidadeItem();
           valorTotalCarrinho += valorItem;
       }
       return valorTotalCarrinho;

    }
    public void exibirItens(){
        System.out.println(this.itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItens("Telefone", 4000d,1);
        carrinhoDeCompras.adicionarItens("Notebook", 5000d,2);
        carrinhoDeCompras.adicionarItens("Monitor", 1000d,1);

        System.out.println("Os itens da lista são: ");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItens("Telefone");
        System.out.println("Os itens da lista são: ");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é de R$ "+carrinhoDeCompras.calcularValorTotal());
    }
}