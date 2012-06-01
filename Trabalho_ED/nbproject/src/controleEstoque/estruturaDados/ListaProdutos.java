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
    
    public boolean alteraProduto(Produto produtoAntigo, Produto produtoNovo){
        boolean alterar = false;
        
        No lista = this.inicio;
        while(lista.getProx() != null){
            
            if(lista.getObjeto() == produtoAntigo){
                alterar = true;
            }
            
            if(!alterar)
                lista.setObjeto(lista.getProx());
            else{
                lista.setObjeto(produtoNovo);
                break;
            }
        }
        
        
        return alterar;
    }
    
    public No getLista(){
        return inicio;
    }
    
    public void setLista(No lista){
        this.inicio = lista;
    }
    
    public int count(){
        int i = 0;
        No aux = inicio;
        
        while(aux != null){
            i++;
            aux = aux.getProx();
        }                    
        return i;
    }
    
    public String percorreLista(){
        String lista = "";
        No aux = inicio;
        
        while(aux != null){
            lista += aux.getObjeto().toString();
            aux = aux.getProx();
        }
        
        return lista;
    }

    public int getTamanhoLista () {
        No aux = inicio; 
        int tamanho = 0;
        
        while (aux != null) {
            aux = aux.getProx();
            tamanho++;
        }
        
        return tamanho;
    }
    
    public String[] percorreListaArray(){
        
        String[] lista = new String[this.getTamanhoLista()];
        No aux = inicio;
       
        int i = 0;
        
        while(aux != null){
            lista[i] = aux.getObjeto().toString();
            aux = aux.getProx();
            i++;
        }
        
        return lista;              
    }
}

