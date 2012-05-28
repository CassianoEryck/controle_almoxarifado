package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class Estoque {
    private Estatisticas estatistica = new Estatisticas();
    int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }       
    
    public void atualizarQuantidade(int quantidade){
        
    }
    
    public void atualizarEstoque(){
        
    }
    
    public boolean verificaDisponibilidade(int quantidade){
        return true;
    }
    
    public void baixaEstoque(int quantidade){
        
    }
    
    public void indicarQuantidade(int quantidade){
        
    }

}
