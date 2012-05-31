package controleEstoque.estruturaDados;
import controleEstoque.entidades.Produto;
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
    
    public Produto remove(Produto produto){
        Produto produtoRetorno = new Produto();
        
        No lista = this.inicio;
        while(lista.getProx() != null){
            
            if(lista.getObjeto() == produto){
                produtoRetorno = produto;
            }
            
            lista.setObjeto(lista.getProx());
        }
        
        
        return produtoRetorno;
    }
    
    public No getLista(){
        return inicio;
    }
    
    public void setLista(No lista){
        this.inicio = lista;
    }

}

