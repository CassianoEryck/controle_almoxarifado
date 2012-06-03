package controleEstoque.controladores;

import controleEstoque.entidades.Fornecedor;
import controleEstoque.estruturaDados.ListaFornecedor;
import controleEstoque.estruturaDados.No;
import controleEstoque.formularios.FmrAdicionaFornecedor;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 * @author Eduardo Lacerda
 * Data: Jun 2, 2012
 */
public class ControlFornecedor {
    ListaFornecedor listaFornecedor;

    public ControlFornecedor() {
        listaFornecedor = obtemListaFornecedor();
    }
    
    
    /**
     * Chama a tela de fornecedor
     */
    public void chamaTelaFornecedor(){
        FmrAdicionaFornecedor frmAdicionaFornecedor = new FmrAdicionaFornecedor();
        frmAdicionaFornecedor.setLocationRelativeTo(null);
        frmAdicionaFornecedor.setVisible(true);
        frmAdicionaFornecedor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }   
   
    public ListaFornecedor obtemListaFornecedor(){
        return new ListaFornecedor();
    }
    
    public JComboBox obtemListaFornecedor(JComboBox cbFornecedor){
        ListaFornecedor listaFornecedor = obtemListaFornecedor();
        No aux = listaFornecedor.getLista();
        int i = 0;
        
        cbFornecedor.removeAllItems();
        
        while(aux != null){
            Fornecedor forn = (Fornecedor) aux.getObjeto();
            cbFornecedor.insertItemAt(forn.getNome(), i);
            i++;
            aux = aux.getProx();           
        }
        
        return cbFornecedor;                            
        
    }
    
    public Fornecedor pesquisaFornecedor(String fornecedor){
        return new Fornecedor();
    }
    
    public void adiciona(Fornecedor fornecedor){
        listaFornecedor.adiciona(fornecedor);
    }
    
    

}
