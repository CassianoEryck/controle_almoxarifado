package controleEstoque.controladores;

import controleEstoque.FrmMenuPrincipal;
import controleEstoque.formularios.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class ControlMain {
    
   public FormLogin frmLogin = new FormLogin();   
    
    public void criaFormularioLogin(){
        frmLogin.setVisible(true);
        frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void criaMenuPrincipal(FormLogin frmLogin, boolean autenticado){
        if(autenticado){
            frmLogin.dispose();
          FrmMenuPrincipal menu = new FrmMenuPrincipal();
          menu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(frmLogin, "Usuário ou senha inválidos!", "Erro",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    
    }
    
     public void chamaRegistrarSaida(FrmMenuPrincipal menu) {
         FrmRegistrarSaida saida = new FrmRegistrarSaida();
         
         menu.getJDesktopPane().removeAll();
         
         menu.getJDesktopPane().add(saida);
         
         saida.setSize(menu.getJDesktopPane().getWidth(), 
                 menu.getJDesktopPane().getHeight());
         
         saida.setVisible(true);     
      }   

        public void criaListaRegistrarSaida () {
        FrmListaSaidaProdutos listaSaida = new FrmListaSaidaProdutos();
        
        listaSaida.setVisible(true);
    
       }
        
        public void criaIndicarProduto () {
            frmIndicarCompra indicarProduto = new frmIndicarCompra();
            
            indicarProduto.setVisible(true);
        }

     public void chamaListaProdutos(FrmMenuPrincipal menu) {
         FrmListaProduto produto = new FrmListaProduto();
         
         menu.getJDesktopPane().removeAll();
         
         menu.getJDesktopPane().add(produto);
         
         produto.setSize(menu.getJDesktopPane().getWidth(),
                 menu.getJDesktopPane().getHeight());
         
         produto.setVisible(true);
     }
     
     public void chamaListaFornecedores(FrmMenuPrincipal menu) {
         FrmListaFornecedores fornecedor = new FrmListaFornecedores();
         
         menu.getJDesktopPane().removeAll();
       
         menu.getJDesktopPane().add(fornecedor);
         
         fornecedor.setSize(menu.getJDesktopPane().getWidth(),
                 menu.getJDesktopPane().getHeight());
         
         fornecedor.setVisible(true);
     }

}
