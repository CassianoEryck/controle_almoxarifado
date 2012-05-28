package controleEstoque;

import controleEstoque.formularios.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class ControlMain {
    
    FormLogin frmLogin = new FormLogin();   
    
    public void criaFormularioLogin(){
        frmLogin.setVisible(true);
        frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void criaMenuPrincipal(FormLogin frmLogin, boolean autenticado){
        if(autenticado){
            frmLogin.dispose();
            new FormMenuPrincipal();
        }else{
            JOptionPane.showMessageDialog(frmLogin, "Você não está autenticado, o programa irá ser encerrado.");
            System.exit(0);
        }
            
    }
    
    public void criaFormManterProdutos(){
        
    }
    
    public void criaFormManterEstoque(JFrame jframe){
        FrmManterEstoque frmManterEstoque = new FrmManterEstoque();
        frmManterEstoque.setVisible(true);
        frmManterEstoque.setLocationRelativeTo(null);        
    }

}
