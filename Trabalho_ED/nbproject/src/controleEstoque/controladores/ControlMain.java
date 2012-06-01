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
    
   public FormLogin frmLogin = 
           new FormLogin();   
    
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
            FrmIndicarCompra indicarProduto = new FrmIndicarCompra();
            
            indicarProduto.setVisible(true);
        }

     public void chamaListaProdutos(FrmMenuPrincipal menu) {
         FrmListaProduto frmProduto = new FrmListaProduto();
       //  Login login = new Login();
         
         menu.getJDesktopPane().removeAll();
         menu.getJDesktopPane().add(frmProduto);
         
         frmProduto.setSize(menu.getJDesktopPane().getWidth(),
                 menu.getJDesktopPane().getHeight());
         
         /* if (login.permission == diretor)
         produto.btnProdutosPendentes.setEnabled(false); */
         frmProduto.setVisible(true);
     }
     
     public void chamaListaFornecedores(FrmMenuPrincipal menu) {
         FrmListaFornecedores fornecedor = new FrmListaFornecedores();
         
         menu.getJDesktopPane().removeAll();
         menu.getJDesktopPane().add(fornecedor);
 
         fornecedor.setSize(menu.getJDesktopPane().getWidth(),
                 menu.getJDesktopPane().getHeight());
         
         fornecedor.setVisible(true);
     }

     public void criaDetalhesProduto () {
         frmDetalhesProduto frmDetalhes = new frmDetalhesProduto();
         
         frmDetalhes.setVisible(true);
     }
}
