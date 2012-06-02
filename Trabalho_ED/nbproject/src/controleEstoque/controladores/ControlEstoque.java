package controleEstoque.controladores;
import controleEstoque.entidades.*;
import controleEstoque.formularios.frmAdicionarQuantidade;

/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 * <b> Classe que controla as operações de Estoque </b>
  */
public class ControlEstoque {

    Estoque e = new Estoque();
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
        
        frmAdicionarQuantidade frmAddQnt = new frmAdicionarQuantidade();
        e.atualizarQuantidade(Integer.parseInt
                (frmAddQnt.getTxtQtdAdquirida().getText()));
    
        // ou linha da FrmListaSaidaProdutos pra saída, pegando quantidade e
        //multiplicando por -1, para ele subtrair da quantidade total
        
    }
    
    public boolean verificaDisponibilidade(Produto produto, int quantidade){
        return false;
    }
    
    public void baixaEstoque(Produto produto, int quantidade){
        
    }
    
    public void indicarQuantidade(int quantidade){
        
    }
    
    

}
