//package supermercado;

import java.util.ArrayList;
import java.util.List;



public class Supermercado {
// Início do código
    public static void main(String[] args) {
        // Adiciona os produtos no carrinho
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adicionarProduto("Arroz", 1, 3.99);
    carrinho.adicionarProduto("Filé de frango sassami", 2, 21.99);
    
    
    // Cria um novo pedido
    Pedido pedido = new Pedido(1, carrinho);
    pedido.setNumeroPedido(1);
    pedido.setCarrinho(carrinho);
    pedido.fecharPedido();

   }
}
    
    // Classe que representa um pedido, lugar onde irá ficar
    class Pedido {
        private int NumeroPedido;
        private CarrinhoDeCompras carrinho;
        
        //Contrutor do pedido
        public Pedido(int numeroPedido, CarrinhoDeCompras carrinho) {
            this.NumeroPedido = numeroPedido;
            this.carrinho = carrinho;
        }
        //define o número do pedido
        public void setNumeroPedido(int numeroPedido) {
            this.NumeroPedido = numeroPedido;
        }
        // Define o carrinho, associado ao pedido
        public void setCarrinho(CarrinhoDeCompras carrinho) {
            this.carrinho = carrinho;
        }
        // Exibe os dados , depois de fechar o pedido
        public void fecharPedido() {
            System.out.println("Pedido numero: " + NumeroPedido); 
            carrinho.mostrarProdutos();
            carrinho.calcularTotal();
        }
    }

    // Classe que representa o carrinho de compras 
    class CarrinhoDeCompras {
        private List<Produto> produtos = new ArrayList<>();
        
        //Adiciona um produto á lista 
        public void adicionarProduto(String nome, int quantidade, double preco){
            produtos.add(new Produto(nome, quantidade, preco));
    
    }
        //Mostra os produtos adicionados no carrinho
        public void mostrarProdutos(){
            System.out.println("Produtos no carrinho:");
            for (Produto produto : produtos){
                System.out.println("- " + produto.nome + " | Quantidade: " + produto.quantidade + " | Preço: R$" + produto.preco);
            }
        }
        // Calcula todos os produtos, adicionados no carrinho
        public void calcularTotal() {
            double total = 0;
            for (Produto produto : produtos){
                total += produto.preco * produto.quantidade;
            }
            System.out.println("Total do carrinho: R$" + total);
        }
    }  
            // Classe que representa um produto
           class Produto{
             String nome;
             int quantidade;
             double preco;
         
             //Construtor do produto
         public Produto(String nome, int quantidade, double preco){
             this.nome = nome;
             this.quantidade = quantidade;
             this.preco = preco;
         }
           }






