package controleEstoque.controladores;

import controleEstoque.entidades.Fornecedor;
import controleEstoque.formularios.FmrAdicionaFornecedor;
import javax.swing.JFrame;

/**
 * @author Eduardo Lacerda
 * Data: Jun 2, 2012
 */
public class ControlFornecedor {

    public ControlFornecedor() {
        
    }
    
    /**
     * Chama a tela de fornecedor
     */
    public void chamaTelaFornecedor(){
        FmrAdicionaFornecedor frmAdicionaFornecedor = new FmrAdicionaFornecedor();
        frmAdicionaFornecedor.setLocationRelativeTo(null);
        frmAdicionaFornecedor.setVisible(true);
        frmAdicionaFornecedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void chamaTelaFornecedor(Fornecedor forn){
        
    }
    
    

}
