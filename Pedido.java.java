//package supermercado;

import java.util.ArrayList;
import java.util.List;



public class Supermercado {

    public static void main(String[] args) {
        // carrinho
    CarrinhoDeCompras c = new CarrinhoDeCompras();
    c.adicionarProduto("Arroz", 1, 3.99);
    c.adicionarProduto("Filé de frango sassami", 2, 21.99);
    
    
    //pedido
    Pedido p = new Pedido(1, c);
    p.setNumeroPedido(1);
    p.setCarrinho(c);
    p.fecharPedido();

   }
}
    
    
    class Pedido {
        private int NumeroPedido;
        private CarrinhoDeCompras carrinho;
        
        public Pedido(int numeroPedido, CarrinhoDeCompras carrinho) {
            this.NumeroPedido = numeroPedido;
            this.carrinho = carrinho;
        }
        
        public void setNumeroPedido(int numeroPedido) {
            this.NumeroPedido = numeroPedido;
        }
        
        public void setCarrinho(CarrinhoDeCompras carrinho) {
            this.carrinho = carrinho;
        }
        
        public void fecharPedido() {
            System.out.println("Pedido numero: " + NumeroPedido); 
            carrinho.mostrarProdutos();
            carrinho.calcularTotal();
        }
    }

    class CarrinhoDeCompras {
        private List<Produto> produtos = new ArrayList<>();

        public void adicionarProduto(String nome, int quantidade, double preco){
            produtos.add(new Produto(nome, quantidade, preco));
    
    }
        public void mostrarProdutos(){
            System.out.println("Produtos no carrinho:");
            for (Produto produto : produtos){
                System.out.println("- " + produto.nome + " | Quantidade: " + produto.quantidade + " | Preço: R$" + produto.preco);
            }
        }
        
        public void calcularTotal() {
            double total = 0;
            for (Produto produto : produtos){
                total += produto.preco * produto.quantidade;
            }
            System.out.println("Total do carrinho: R$" + total);
        }
    }  
      
           class Produto{
             String nome;
             int quantidade;
             double preco;
         
    
         public Produto(String nome, int quantidade, double preco){
             this.nome = nome;
             this.quantidade = quantidade;
             this.preco = preco;
         }
           }






