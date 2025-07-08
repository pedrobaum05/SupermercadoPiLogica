//ETAPA 7 PI CODIGO PARA TESTAR     

    
    import modelo.Produto;
    import modelo.ProdutoService;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

     public class ProdutoServiceTest {
        
        @Test
        public void testCalcularTotal(){
            Produto produto = new Produto("Arroz", 5, 2);
            ProdutoService service = new ProdutoService();
            
            double resultado = service.calcularTotal(produto);
            
            assertEquals(10.0, resultado, 0.001);
            
        }
        
   }