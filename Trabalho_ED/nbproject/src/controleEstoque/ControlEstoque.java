package controleEstoque;
/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 * <b> Classe que controla as operações de Estoque </b>
  */
public class ControlEstoque {
    
    /**
     * Operação que avalia se o produto tem necessidade de compra a partir das estatisticas geradas por ele.
     * @param estatisticas, a partir das estatisticas de um produto, verifica a necessidade de compra.
     * @return retorna verdadeiro caso seja necessário a necessidade de compra.
     */
    
    public boolean informaNecessidadeCompra(Estatisticas estatisticas){
        return true;
    } 
    
    /**
     * atualiza as estatisticas de determinado produto
     * @param produto 
     */
    public void atualizaEstatisticas(Produto produto){
        
    }
    
    public void verificarNecessidadeCompra(Produto produto){
        
    }
    
    public void atualizarEstoque(Produto produto){
        
    }
    
    public boolean verificaDisponibilidade(Produto produto, int quantidade){
        return false;
    }
    
    public void baixaEstoque(Produto produto, int quantidade){
        
    }
    
    public void indicarQuantidade(int quantidade){
        
    }
    
    

}
