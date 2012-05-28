package controleEstoque.estruturaDados;
import controleEstoque.Produto;
/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class ListaProdutos {
    
    No inicio;
    
    public ListaProdutos(){
        inicio = null;
    }
    
    public void adiciona(Produto produto){
        No novo = new No(produto);
        if(inicio == null){
            inicio = novo;
        }else{
            No aux = inicio;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = novo;
        }
    }
    
    public Produto remove(){
        Produto produto = new Produto();
        
        return produto;
    }

}

class No{
    Produto produto;
    No prox;
    
    public No(Produto produto){
        this.produto = produto;
        prox = null;
    }
    
}
