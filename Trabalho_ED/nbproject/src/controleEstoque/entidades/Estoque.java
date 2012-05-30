package controleEstoque.entidades;
/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class Estoque {
    private Estatisticas estatistica = new Estatisticas();
    int quantidade;

    public Estoque() {
        this.estatistica = new Estatisticas();
        this.quantidade = 0;
    }
    
    public Estoque(int quantidade, Estatisticas estatistica){
        this.quantidade = quantidade;
        this.estatistica = estatistica;
    }
    
    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estatisticas getEstatistica() {
        return estatistica;
    }

    public void setEstatistica(Estatisticas estatistica) {
        this.estatistica = estatistica;
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

    @Override
    
    public String toString() {
        return estatistica + "\n" + quantidade + "\n";
    }
    
    

}
